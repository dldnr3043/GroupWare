package com.mycompany.groupware.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.groupware.DAO.UserDAO;
import com.mycompany.groupware.VO.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public void create(UserVO userVO) throws Exception {
		dao.create(userVO);
	}
	
	public UserVO read(String input) throws Exception {
		return dao.read(input);
	}
	
	public UserVO readMail(String email) throws Exception {
		return dao.readMail(email);
	}
	
	public UserVO login(String employee_no, String pw) throws Exception {
		return dao.login(employee_no, pw);
	}
	
	public List<UserVO> isAuth(int is_auth) throws Exception {
		return dao.isAuth(is_auth);
	}
	
	public void update(UserVO userVO) throws Exception {
		dao.update(userVO);
	}

	public void delete(String employee_no) throws Exception {
		dao.delete(employee_no);
	}

	public List<UserVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
}
