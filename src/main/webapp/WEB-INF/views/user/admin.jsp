<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Sang Company</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="${pageContext.servletContext.contextPath}/resources/assets/css/search_employee.css" rel="stylesheet" type="text/css">
<link href="${pageContext.servletContext.contextPath}/resources/assets/css/table.css" rel="stylesheet" type="text/css">

<link rel="stylesheet" type="text/css" media="screen" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.servletContext.contextPath}/assets/jqgrid/css/ui.jqgrid.css" />

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="${pageContext.servletContext.contextPath}/assets/jqgrid/js/jquery.jqGrid.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/js/admin.js" type="text/javascript"></script>


 <script type="text/javascript">  
 
 </script>
</head>
<body>


<c:import url="/WEB-INF/views/includes/header.jsp"/>
<c:import url="/WEB-INF/views/includes/top_gnb.jsp"/>




<div id = "list_div">
<table id="list" border="1">
	<tr>
		<th>이름</th>
		<th>소속</th>
		<th>직급</th>
		<th>이메일</th>
		<th>가입승인</th>
	</tr>
	
	<!-- 목록 시작 -->
	<c:forEach items="${list}" var="list">
		<tr>
			<form  name="authform" method="post" action="${pageContext.servletContext.contextPath }/user/admin" 
		enctype="multipart/form-data" accept-charset="utf-8">
		
			<td align=center><input type="text" name="employee_name" value=${ list.employee_name } style="border: none; background: transparent;width:100%" readonly></td>
			<td align=center><input type="text" name="team_name" value=${ list.team_name } style="border: none; background: transparent;width:100%" readonly></td>
			<td align=center><input type="text" name="position_id" value=${ list.position_id } style="border: none; background: transparent;width:100%" readonly></td>
			<td align=center><input type="text" name="email" value=${ list.email } style="border: none; background: transparent;width:100%" readonly></td>
			<td align=center><input type="submit" value="가입승인"></td>
			</form>
		</tr>
	</c:forEach>
	<!-- 목록 끝 -->
</table>

</div>
<c:import url="/WEB-INF/views/includes/footer.jsp"/>

</body>
</html>