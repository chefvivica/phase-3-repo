package com.demoapp.springbootDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public List<User> userList = new ArrayList<>(); 
	public boolean loginValid(String uname, String pass) {
		if(uname.equals("admin")&& pass.equals("123")) {
			return true;
		}
		return false;
	}
	
	public boolean registrationVaild(String uname, String pass, String email, String city) {
		userList.add(new User(uname, pass, email, city));
		userList.forEach(u-> System.out.println(u.getUname()));
		return true;		
	}
	
	
}
