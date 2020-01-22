package com.mijuamon.technicalTestHB.services;

import java.math.BigDecimal;

public interface MainService {
	
	public abstract BigDecimal calculateTotalAmount(String description, 
													BigDecimal price, 
													Integer numberOfItems, 
													String state);

}
