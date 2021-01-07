package com.demoapp.springbootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller//step 1
@RequestMapping("/main")
public class MainApp {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)//step 2
	//return jsp, need to add jsp under src/webapp/WEB-INF/pages and           add application.properties // add tomcat dependency
	public String login() {
		return "login";
	}
	
//	@RequestMapping(value = "/hi", method = RequestMethod.GET)
//	@ResponseBody//step 3 not jsp page return string only
//	public String sayHi() {
//		return "welcome";
//	}
//	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)//step 2
//	@ResponseBody
//	public String loginValid(@RequestParam("uname") String name, @RequestParam("pass") String pass) {
//		if(userService.loginValid(name, pass)) {
//			return "login successfully";
//		}
//		return "login failed";
//	}
//	
//	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	@ResponseBody
	public String registrationValid(@RequestParam("uname") String name, @RequestParam("pass") String pass, @RequestParam("email") String email, @RequestParam("city") String city) {		
		if(userService.addUser(name,pass,email,city)){
			return "welcome " + name;
		}
		return "something went wrong..";
	}
	
	
}
