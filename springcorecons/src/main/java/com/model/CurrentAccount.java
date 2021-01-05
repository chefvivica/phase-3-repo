package com.model;

public class CurrentAccount implements InterestCalculator{
	private double roi;
	private int duration;
	
	public CurrentAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}

	@Override
	public double calculate(double amount) {
		
		return roi*duration/amount;
	}
	
	
}
