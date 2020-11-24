function DosignUp() {
    
    var employee_no = joinform.employee_no.value;
    var pw = joinform.pw.value;
    var employee_name = joinform.employee_name.value;
    var email = joinform.email.value;
    var file = joinform.file.value;
    
    if(employee_no.length == 0)
        alert("사원번호를 입력해 주세요.");
    else if(pw.length >= 0 && pw.length <= 7)
    	alert("비밀번호는 8자리 이상입니다.");
    else if(employee_name.length == 0)
    	alert("이름을 입력해 주세요.");
    else if(email.length == 0)
    	alert("이메일을 입력해 주세요.");
    else if(file.length == 0)
    	alert("이미지를 등록해 주세요.");
    else
    	joinform.submit();
}
