package com.demoapp.springbootDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	public List<User> userList = new ArrayList<>(); 
	public boolean loginValid(String uname, String pass) {
		if(userList.contains(uname)) {
			return true;
		}
		return false;
	}
	
	public boolean addUser(String uname, String pass, String email, String city) {
		userList.add(new User(uname, pass, email, city));
		userList.forEach(u-> System.out.println(u.getUname()));
		return true;		
	}
	
	public List<User> loadUsers(){
		return userList;
	}
	
	public boolean findUser(String uname) {
		for(User user : userList) {
			if(user.getUname().equals(uname)) {
				System.out.println("user found"+ user.getEmail());
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUser(String email, String uname) {
		for(User user: userList) {
			if(user.getUname().equals(uname)) {
				user.setEmail(email);
				return true;
			}
		}
		return false;
	}
	

	public boolean deleteUser(String uname) {
		for(User user: userList) {
			if(user.getUname().equals(uname)) {
				userList.remove(user);
				return true;
			}
		}
		return false;
	}
}
