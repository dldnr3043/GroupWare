<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<title>My Company</title>

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/resources/assets/js/join.js" type="text/javascript"></script>

<link
	href="${pageContext.servletContext.contextPath }/resources/assets/css/join.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div class="form-wrap">
		<form  name="joinform" method="post" action="${pageContext.servletContext.contextPath }/user/join" 
		enctype="multipart/form-data" accept-charset="utf-8">
			<img src="${pageContext.servletContext.contextPath }/resources/assets/images/title.png" />
			<div>
				<p id="join">회원가입</p>
			</div>
			<div id="menu">
				<p>사번</p>
				<p>비밀번호</p>
				<p>사진업로드</p>
				<p>이름</p>
				<p>소속</p>
				<p>이메일</p>
				<p>직급</p>
				
			</div>
			<div id="form">
				<p>
					<input type="text" name="employee_no"> 
				</p>
				<p>
					<input type="password" name="pw" /> 
				</p>
				<p>
					<input type="file" name="file">
				</p>
				<p>
					<input type="text" name="employee_name" />
				</p>
				<p>
					<select id="teamId" name="team_name" style="width:160.8px; HEIGHT:22PX">
						<option value="개발1팀">개발1팀</option>
    					<option value="개발2팀">개발2팀</option>
    					<option value="개발3팀">개발3팀</option>
    					<option value="개발4팀">개발4팀</option>
					</select>
				</p>
				<p>
					<input type="text" name="email" />
				</p>
				<p>
					<select id="positionId" name="position_id" style="width:160.8px; HEIGHT:22PX" >
						<option value="사원">사원</option>
    					<option value="주임">주임</option>
    					<option value="대리">대리</option>
    					<option value="과장">과장</option>
    					<option value="차장">차장</option>
    					<option value="부장">부장</option>
					</select>
				</p>
			</div>

			<input type=button style="width:160.8px; HEIGHT:22PX" value="가입요청하기" onclick="DosignUp()">
		</form>
	</div>

</body>
</html>