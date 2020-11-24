package com.mycompany.groupware;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.groupware.DAO.UserDAO;
import com.mycompany.groupware.VO.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class UserDAOTest {
	@Inject
	private UserDAO dao;

	/*@Test
	public void testInsertMember() throws Exception {
		UserVO vo = new UserVO();
		vo.setEmployee_no("2015136091");
		vo.setPw("testPW");
		vo.setImage_url("testurl");
		vo.setEmployee_name("testname");
		vo.setTeam_name("testteam");
		vo.setEmail("testemail");
		vo.setPosition_id(1);
		dao.create(vo);
	}*/
	@Test
	public void testreadMember() throws Exception {
		System.out.println(dao.login("2015136091", "1"));
	}
	/*@Test
	public void testupdateMember() throws Exception {
		UserVO userVO = dao.read("2015136091");
		
		userVO.setPosition_id(1);
		
		dao.update(userVO);
	}*/
	
	/*@Test
	public void testdeleteMember() throws Exception {
		dao.delete("2015136091");
	}*/
	/*@Test
	public void testlistAllMember() throws Exception {
		List<UserVO> list = new ArrayList<UserVO>();
		
		list = dao.listAll();
		
		for(int i=0;i<dao.listAll().size();i++)
			System.out.println(dao.listAll().indexOf(i));
	}*/
}
