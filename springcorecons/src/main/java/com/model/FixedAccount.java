package com.model;

public class FixedAccount implements InterestCalculator{
	private double roi;
	private int duration;
	
	public FixedAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}

	@Override
	public double calculate(double amount) {
		
		return roi*duration/amount;
	}
	
	public FixedAccount() {
		System.out.println("inside fda");
	}

}
