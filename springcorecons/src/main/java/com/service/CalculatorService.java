package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.model.InterestCalculator;

public class CalculatorService {//injecting 
	
	private InterestCalculator ic;
	

	public CalculatorService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}

	public double service(double amount) {//when the client call the service which class which class will be injected 
		return ic.calculate(amount);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("inside init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy");
	}
}
