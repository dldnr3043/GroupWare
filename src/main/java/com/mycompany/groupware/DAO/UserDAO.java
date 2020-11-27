package com.mycompany.groupware.DAO;

import java.util.List;

import com.mycompany.groupware.VO.UserVO;


public interface UserDAO {
	public void create(UserVO userVO) throws Exception;
	public UserVO read(String input) throws Exception;
	public UserVO readMail(String email) throws Exception;
	public UserVO login(String employee_no, String pw) throws Exception;
	public List<UserVO> isAuth(int is_auth) throws Exception;
	public void update(UserVO userVO) throws Exception;
	public void delete(String employee_no) throws Exception;
	public List<UserVO> listAll() throws Exception;
}
