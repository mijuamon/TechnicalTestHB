package com.mijuamon.technicalTestHB.model;

public class SpecialTax {
	
	private String description;
	private double tax;
	
	
	public SpecialTax() {
		super();
	}
	
	public SpecialTax(String description, double tax) {
		super();
		this.description = description;
		this.tax = tax;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
