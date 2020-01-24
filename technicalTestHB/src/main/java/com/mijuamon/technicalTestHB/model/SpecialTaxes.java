package com.mijuamon.technicalTestHB.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="specialTaxes")
public class SpecialTaxes {

	@XmlElement(name="specialTax", type=SpecialTax.class)
	private List<SpecialTax> specialTaxes = new ArrayList<>();
	
	public SpecialTaxes() {
		super();
	}

	public SpecialTaxes(List<SpecialTax> specialTaxes) {
		super();
		this.specialTaxes = specialTaxes;
	}

	public List<SpecialTax> getSpecialTaxes() {
		return specialTaxes;
	}

	public void setSpecialTaxes(List<SpecialTax> specialTaxes) {
		this.specialTaxes = specialTaxes;
	}
	
	
	
}
