package com.mycompany.groupware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/* 게시물 페이지 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String board() {
		logger.info("getlogin");
		return "board/index";
	}
}
