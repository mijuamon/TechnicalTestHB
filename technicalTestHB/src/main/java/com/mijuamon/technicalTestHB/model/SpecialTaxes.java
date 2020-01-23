package com.mijuamon.technicalTestHB.model;

public class SpecialTaxes {
	
	private String description;
	private double tax;
	
	
	public SpecialTaxes() {
		super();
	}
	
	public SpecialTaxes(String description, double tax) {
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
