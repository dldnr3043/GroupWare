package com.mycompany.groupware.VO;

public class UserVO {
	String employee_no;
	String team_name;
	String email;
	String employee_name;
	String join_date;
	String pw;
	String last_login;
	int position_id;
	String role;
	String image_url;
	int is_auth;
	
	public int getIs_auth() {
		return is_auth;
	}

	public void setIs_auth(int is_auth) {
		this.is_auth = is_auth;
	}

	public UserVO() {
		super();
	}

	public String getEmployee_no() {
		return employee_no;
	}

	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	@Override
	public String toString() {
		return "UserVO [employee_no=" + employee_no + ", team_name=" + team_name + ", email=" + email
				+ ", employee_name=" + employee_name + ", join_date=" + join_date + ", pw=" + pw + ", last_login="
				+ last_login + ", position_id=" + position_id + ", role=" + role + ", image_url=" + image_url
				+ ", is_auth=" + is_auth + "]";
	}
	
	
}
