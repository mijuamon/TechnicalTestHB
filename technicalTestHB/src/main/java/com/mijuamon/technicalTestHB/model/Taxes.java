package com.mijuamon.technicalTestHB.model;

public class Taxes {
	
	private String state;
	private String description;
	private double localTax;
	
	
	public Taxes() {
		super();
	}
	
	public Taxes(String state, String description, double localTax) {
		super();
		this.state = state;
		this.description = description;
		this.localTax = localTax;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getLocalTax() {
		return localTax;
	}
	
	public void setLocalTax(double localTax) {
		this.localTax = localTax;
	}
	
	

}
