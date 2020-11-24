<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>My Company</title>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="${pageContext.servletContext.contextPath }/resources/assets/css/wrong_base.css" rel="stylesheet" type="text/css">

</head>
<body>

	<div class="container">
		<div class="content">

			<a href="${pageContext.servletContext.contextPath }/user/login">
				<img src="${pageContext.servletContext.contextPath }/resources/assets/images/title.png" />
			</a>
			
			<p>아직 가입승인이 되지 않았습니다.</p>
			<p>관리자에게 연락하거나 기다려주세요.</p>
			
			<a href="${pageContext.servletContext.contextPath }/user/login">돌아가기</a>
			
		</div>
	</div>

</body>
</html>