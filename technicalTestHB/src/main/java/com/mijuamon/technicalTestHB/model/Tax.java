package com.mijuamon.technicalTestHB.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="tax")
public class Tax {
	
	private String state;
	private String description;
	private double localTax;
	private boolean defaultTax;
	
	
	public Tax() {
		super();
	}
	
	public Tax(String state, String description, double localTax, boolean defaultTax) {
		super();
		this.state = state;
		this.description = description;
		this.localTax = localTax;
		this.defaultTax = defaultTax;
	}
	
	
	public boolean isDefaultTax() {
	    return defaultTax;
	}

	public void setDefaultTax(boolean defaultTax) {
	    this.defaultTax = defaultTax;
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
