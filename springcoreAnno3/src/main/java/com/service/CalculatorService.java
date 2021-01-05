package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

@Service(value= "service")
public class CalculatorService {//injecting 
	
	private InterestCalculator ic;
	
	private InterestCalculator getIc() {
		return ic;
	}
	
	@Autowired
	@Qualifier(value="sa")
	public void setIc(InterestCalculator ic) {
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
