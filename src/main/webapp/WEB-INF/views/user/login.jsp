<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<title>My Company</title>

<meta http-equiv="content-type" content="text/html; charset=utf-8">

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/resources/assets/js/login.js" type="text/javascript"></script>

<script type="text/javascript">
	var msg = '${msg}';
	if(msg.length != 0) alert(msg);
</script>

<link href="${pageContext.servletContext.contextPath }/resources/assets/css/login.css" rel="stylesheet" type="text/css">
</head>

<body>

	<div class="login-page">
		<div class="form">
		<img src="${pageContext.servletContext.contextPath }/resources/assets/images/title.png" />

			<form name="loginform" method="post" action="${pageContext.servletContext.contextPath }/user/login" accept-charset="utf-8">
				<input type="text" name="employee_no" placeholder="사번을 입력하세요" /> 
				<input type="password" name="pw" placeholder="비밀번호를 입력하세요" />
				<input type="button" value="login" id="confirm" onclick="Dologin()">
				<p class="message">
					계정이 없으신가요? <a href="${pageContext.servletContext.contextPath }/user/join">회원가입</a>
				</p>
			</form>
		</div>
	</div>

</body>
</html>