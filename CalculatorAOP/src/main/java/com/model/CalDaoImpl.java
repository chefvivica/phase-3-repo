package com.model;

import org.springframework.stereotype.Component;

@Component
public class CalDaoImpl implements CalDAO{

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println(x - y);
		
	}

	@Override
	public void multi(int x, int y) {
		System.out.println(x * y);
		
	}

}
