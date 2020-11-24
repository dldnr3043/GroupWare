function Dologin() {
    
    var employee_no = loginform.employee_no.value;
    var pw = loginform.pw.value;
    
    if(employee_no.length == 0)
        alert("사원번호를 입력해 주세요.");
    else if(pw.length == 0)
    	alert("비밀번호를 입력해주세요.");
    else {
    	loginform.submit();
    }	
}
