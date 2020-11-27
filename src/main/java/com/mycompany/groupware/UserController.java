package com.mycompany.groupware;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.groupware.Service.UserService;
import com.mycompany.groupware.Service.FileUploadService;
import com.mycompany.groupware.VO.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private FileUploadService fileuploadservice;
	
	@Autowired
	private UserService userService;
	
	/* 현재 시간 구하는 함수 */
	public String time() {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String time1 = format1.format(time);
		
		return time1;
	}
	
	/* 로그인 페이지 */
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getlogin() {
		logger.info("getlogin");
		return "user/login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String postlogin(@ModelAttribute UserVO userVO, HttpServletRequest req, Model model) throws Exception {
		logger.info("postlogin");
		
		HttpSession session = req.getSession();
		UserVO login = userService.login(userVO.getEmployee_no(), userVO.getPw());
		
		if(login == null) {
			logger.info("로그인 실패");
			session.setAttribute("user", null);
			model.addAttribute("msg", "입력하신 정보가 틀렸습니다.");
			return "user/login";
		}
		else {
			if(login.getIs_auth() == 0) {
				logger.info("로그인 실패");
				return "redirect:/" + notapproval();
			}
			else {
				login.setLast_login(time());
				userService.update(login);
				logger.info("로그인 성공");
				session.setAttribute("user", login);
				return "redirect:/main";
			}
		}
	}
	
	/* 회원가입 페이지 */
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String getjoin() {
		logger.info("getjoin");
		return "user/join";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String postjoin(@ModelAttribute UserVO userVO,
			@RequestParam( "file" ) MultipartFile file) throws Exception {
		logger.info("postjoin");
		userVO.setImage_url(fileuploadservice.restore(file));
		userService.create(userVO);
		return "redirect:/" + joinsuccess();
	}
	
	/* 관리자 페이지 */
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String getadmin(Model model, HttpServletRequest req) throws Exception {
		logger.info("admin page");
		
		HttpSession session = req.getSession();
		UserVO VO = (UserVO)session.getAttribute("user");	// 현재 세션 정보 가져오기
		
		/* 현재 세션 정보에 해당하는 UserVO가 admin인지 판단하고 알맞게 로직 처리 */
		if(VO.getRole().equals("ADMIN")) {
			List<UserVO> list = new ArrayList<UserVO>();
			list = userService.isAuth(0);
			model.addAttribute("list", list);
			
			return "user/admin";
		}
		else {
			logger.info("잘못된 접근");
			return "redirect:/" + adminpagefault();
		}
	}
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String postadmin(@ModelAttribute UserVO userVO) throws Exception {
		
		logger.info(userVO.getEmail());
		UserVO vo = userService.readMail(userVO.getEmail());
		vo.setIs_auth(1);
		userService.update(vo);
		
		return "redirect:/user/admin";
	}
	
	/* 회원가입 완료되었을 때 나오는 페이지 */
	@RequestMapping(value="/joinsuccess", method=RequestMethod.GET)
	public String joinsuccess() {
		logger.info("joinsuccess");
		return "user/joinsuccess";
	}
	
	
	/* 가입 승인이 되지 않았을 경우 나오는 페이지 */
	@RequestMapping(value="/notapproval", method=RequestMethod.GET)
	public String notapproval() {
		logger.info("notapproval");
		return "user/notapproval";
	}
	
	/* admin이 아닌 유저가 admin 페이지에 접근 할 때 나오는 페이지 */
	@RequestMapping(value="/adminpagefault", method=RequestMethod.GET)
	public String adminpagefault() {
		logger.info("adminpagefault");
		return "user/adminpagefault";
	}
}
