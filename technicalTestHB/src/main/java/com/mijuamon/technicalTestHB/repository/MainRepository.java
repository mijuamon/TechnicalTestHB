package com.mijuamon.technicalTestHB.repository;

import java.util.List;

import com.mijuamon.technicalTestHB.model.Discounts;
import com.mijuamon.technicalTestHB.model.SpecialTaxes;
import com.mijuamon.technicalTestHB.model.Taxes;

public class MainRepository{
	
	private static MainRepository instance=null;
	
	private static List<Taxes> taxes;
	private static List<SpecialTaxes> specialTaxes;
	private static List<Discounts> discounts;
	
	private MainRepository()
	{
		
	}
	
	public static MainRepository getInstance()
	{
		if(instance==null)
		{
			instance=new MainRepository();
		}
		return instance;		
	}
	
	public List<Taxes> getTaxes()
	{
		return null;
	}
	
	public List<SpecialTaxes> getSpecialTaxes()
	{
		return null;
	}
	
	public List<Discounts> getDiscounts	()
	{
		return null;
	}

}
