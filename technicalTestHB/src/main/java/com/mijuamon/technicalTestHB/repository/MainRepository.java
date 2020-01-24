package com.mijuamon.technicalTestHB.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

import com.mijuamon.technicalTestHB.model.Discount;
import com.mijuamon.technicalTestHB.model.Discounts;
import com.mijuamon.technicalTestHB.model.SpecialTax;
import com.mijuamon.technicalTestHB.model.SpecialTaxes;
import com.mijuamon.technicalTestHB.model.Tax;
import com.mijuamon.technicalTestHB.model.Taxes;

public class MainRepository{
	
	@Autowired
    ResourceLoader resourceLoader;
	
	private static final Log LOG = LogFactory.getLog(MainRepository.class);
	
	private static MainRepository instance=null;
	
	private static Taxes taxes;
	private static SpecialTaxes specialTaxes;
	private static Discounts discounts;
	
	private static final String TAXES_FILE="data/taxes.xml";
	private static final String SPECIAL_TAXES_FILE="data/specialTaxes.xml";
	private static final String DISCOUNTS_FILE="data/discounts.xml";
	
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
	
	public List<Tax> getTaxes()
	{
		if(taxes == null)
		{
			readXMLTaxes();
		}
		return taxes.getTaxes();
	}
	
	public List<SpecialTax> getSpecialTaxes()
	{
		if(taxes == null)
		{
			readXMLSpecialTaxes();
		}
		return specialTaxes.getSpecialTaxes();	}
	
	public List<Discount> getDiscounts	()
	{
		if(taxes == null)
		{
			readXMLDiscounts();
		}
		return discounts.getDiscounts();	}
	
	private static void readXMLTaxes()
	{
		JAXBContext context;
		try {
			Resource resource = new ClassPathResource(TAXES_FILE);
			File xmlFile = resource.getFile();

			context = JAXBContext.newInstance(Taxes.class);
			Unmarshaller um = context.createUnmarshaller();
			taxes = (Taxes) um.unmarshal(xmlFile);
		} catch (JAXBException | IOException e) {
			LOG.error(e);
		} 
	}
	
	private static void readXMLSpecialTaxes()
	{
		JAXBContext context;
		try {
			Resource resource = new ClassPathResource(SPECIAL_TAXES_FILE);
			File xmlFile = resource.getFile();

			context = JAXBContext.newInstance(SpecialTaxes.class);
			Unmarshaller um = context.createUnmarshaller();
			specialTaxes = (SpecialTaxes) um.unmarshal(xmlFile);
		} catch (JAXBException | IOException e) {
			LOG.error(e);
		} 
	}
	
	private static void readXMLDiscounts()
	{
		JAXBContext context;
		try {
			Resource resource = new ClassPathResource(DISCOUNTS_FILE);
			File xmlFile = resource.getFile();

			context = JAXBContext.newInstance(Discounts.class);
			Unmarshaller um = context.createUnmarshaller();
			discounts = (Discounts) um.unmarshal(xmlFile);
		} catch (JAXBException | IOException e) {
			LOG.error(e);
		} 
	}
}
