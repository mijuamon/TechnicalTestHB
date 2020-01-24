package com.mijuamon.technicalTestHB.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="taxes")
public class Taxes {
	
	@XmlElement(name="tax", type=Tax.class)
	private List<Tax> taxes = new ArrayList<>();

	
	
	public Taxes() {
		super();
	}

	public Taxes(List<Tax> taxes) {
		super();
		this.taxes = taxes;
	}

	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}
	
	

}
