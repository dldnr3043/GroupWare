<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<header id="main_header">
	<h1 class="logo">
		<a href="${pageContext.request.contextPath }/main" ><img id="title_image" src="${pageContext.servletContext.contextPath }/resources/assets/images/title.png" /></a>
	</h1>

	<div class="login_menu">
		<c:choose>
			<c:when test="${empty user}">
			
			</c:when>
			<c:otherwise>
			<input type="hidden" id="userEmployeeNo" value="${authUser.employeeNo}" >
			
				<span> ${user.employee_no } ${user.position_id }님 반갑습니다.
				<c:if test="${user.role == 'ADMIN' }">
					<a href="${pageContext.servletContext.contextPath }/user/admin">관리페이지</a>
				</c:if>
					<a href="${pageContext.servletContext.contextPath }/user/login">로그아웃</a>

				</span>
				<span> <br>
				<br>최근로그인: ${user.last_login }
				</span>
			</c:otherwise>
		</c:choose>
	</div>
</header>