package com.mijuamon.technicalTestHB.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="discounts")
public class Discounts {
	
	@XmlElement(name="discount", type=Discount.class)
	private List<Discount> discounts = new ArrayList<>();

	
	public Discounts() {
		super();
	}

	public Discounts(List<Discount> discounts) {
		super();
		this.discounts = discounts;
	}

	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}
	
	

}
