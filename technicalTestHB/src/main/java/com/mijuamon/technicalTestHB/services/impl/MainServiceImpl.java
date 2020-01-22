package com.mijuamon.technicalTestHB.services.impl;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.mijuamon.technicalTestHB.services.MainService;

@Service("MainService")
public class MainServiceImpl implements MainService {
	
	private static final Log LOG = LogFactory.getLog(MainServiceImpl.class);

	@Override
	public BigDecimal calculateTotalAmount(String description, BigDecimal price, Integer numberOfItems, String state) {
		
		return null;
	}

}
