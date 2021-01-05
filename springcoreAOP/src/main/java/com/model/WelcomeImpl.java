package com.model;

import org.springframework.stereotype.Component;

@Component
public class WelcomeImpl implements WelcomeDAO{

	@Override
	public String sayWelcome(String name) {
		return "welcome " + name;
		
	}

	@Override
	public void sayHi(String name, String email) {
		// TODO Auto-generated method stub
		System.out.println("lala " + name + " " + email);
		
	}

	@Override
	public void sayAround() {
		System.out.println("say around ");
		
	}




}
