package com.mijuamon.technicalTestHB.services.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.mijuamon.technicalTestHB.model.Discount;
import com.mijuamon.technicalTestHB.model.SpecialTax;
import com.mijuamon.technicalTestHB.model.Tax;
import com.mijuamon.technicalTestHB.repository.MainRepository;
import com.mijuamon.technicalTestHB.services.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	private static final Log LOG = LogFactory.getLog(MainServiceImpl.class);

	@Override
	public BigDecimal calculateTotalAmount(String description, BigDecimal price, Integer numberOfItems, String state) {
		
		 MainRepository repository = MainRepository.getInstance();
		
		 List<Tax> taxes=repository.getTaxes();
		 List<SpecialTax> specialTaxes = repository.getSpecialTaxes();
		 List<Discount> discounts = repository.getDiscounts();
		 
		 BigDecimal totalPrice=price;
		 totalPrice=totalPrice.multiply(BigDecimal.valueOf(numberOfItems));
		 		 
		 BigDecimal discountedPrice=BigDecimal.valueOf(getDiscount(discounts, totalPrice)).multiply(totalPrice);
		 totalPrice=totalPrice.subtract(discountedPrice);
		 
		 Tax selectedTax=taxes.stream().filter(t->t.getState().equals(state)).findFirst().get();	
		 SpecialTax selectedSpecialTax=specialTaxes.stream().filter(t->t.getDescription().contentEquals(description)).findFirst().orElse(new SpecialTax("none", 0.0));
		 
		 BigDecimal taxesPrice =BigDecimal.valueOf(selectedTax.getLocalTax()).multiply(totalPrice).add(BigDecimal.valueOf(selectedSpecialTax.getTax()).multiply(totalPrice));
		 
		 totalPrice=totalPrice.add(taxesPrice);		
		
		 return totalPrice;
	}

	private double getDiscount(List<Discount> discounts, BigDecimal totalPrice) {
	    double discount = 0;
	     for(Discount d:discounts)
	     {
	    	 if(totalPrice.compareTo(BigDecimal.valueOf(d.getOrderValue()))>=0)
	    	 {
	    		 discount=d.getPercentage();
	    	 }
	     }
	    return discount;
	}

}
