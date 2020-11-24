package com.mycompany.groupware.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.groupware.VO.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace = "UserMapper";

	@Override
	public void create(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".create", userVO);
	}

	@Override
	public UserVO read(String input) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".read", input);
	}
	
	@Override
	public UserVO login(String employee_no, String pw) throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("employee_no", employee_no);
		parameter.put("pw", pw);
		
		return sqlSession.selectOne(namespace + ".login", parameter);
	}

	@Override
	public void update(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".update", userVO);
	}

	@Override
	public void delete(String employee_no) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", employee_no);
	}

	@Override
	public List<UserVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".listAll");
	}

}
