package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class FixedAccount implements InterestCalculator{
	@Value("4.5")
	private double roi;
	@Value("5")
	private int duration;
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
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
