package com.mijuamon.technicalTestHB.model;

public class Discounts {
	
	private  Integer orderValue;
	private double percentage;
	
	
	public Discounts() {
		super();
	}
	
	public Discounts(Integer orderValue, double percentage) {
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
