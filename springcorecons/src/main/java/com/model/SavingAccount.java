package com.model;

public class SavingAccount implements InterestCalculator{
	
	private double roi;
	private int duration;
	
	public SavingAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}


	@Override
	public double calculate(double amount) {
		
		return roi*duration/amount;
	}
	
	
	public SavingAccount() {
		System.out.println("inside sa");
	}
}
