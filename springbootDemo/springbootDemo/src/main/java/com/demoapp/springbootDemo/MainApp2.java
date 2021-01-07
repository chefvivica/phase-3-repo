package com.demoapp.springbootDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainApp2 {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public String loginValid(@RequestParam("uname") String name, @RequestParam("pass") String pass) {
		if(userService.loginValid(name, pass)) {
			return "login successfully";
		}
		return "login failed";
	}
	
	@GetMapping("/loadusers")
	public List<User> load(){
		return userService.loadUsers();
	}
	
	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable("name") String name) {
		if(userService.findUser(name)) {
			return "user found";
		}
		return "user not found";
	}
	
	@GetMapping("/updateuser/{name}/{email}")
	public String updateUser(@PathVariable("name") String name, @PathVariable("email") String email) {
		if(userService.updateUser(email, name)) {
			return "user updated";
		}
		return "sorry, user couldn't update";
	}
	
	@GetMapping("/deleteuser/{name}")
	public String deleteUser(@PathVariable("name") String name) {
		if(userService.deleteUser( name)) {
			return "user deleted";
		}
		return "sorry, user couldn't delete";
	}
	
}
