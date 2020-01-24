package com.mijuamon.technicalTestHB.model;

public class Discount {
	
	private  Integer orderValue;
	private double percentage;
	
	
	public Discount() {
		super();
	}
	
	public Discount(Integer orderValue, double percentage) {
		super();
		this.orderValue = orderValue;
		this.percentage = percentage;
	}
	
	public Integer getOrderValue() {
		return orderValue;
	}
	
	public void setOrderValue(Integer orderValue) {
		this.orderValue = orderValue;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	

}
