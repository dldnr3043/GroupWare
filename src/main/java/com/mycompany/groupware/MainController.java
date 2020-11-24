package com.mycompany.groupware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(  "/" )
	public String login() {
		return "user/login";
	}
	
	@RequestMapping( "/main")
	public String main() {
		return "main/main";
	}
}
