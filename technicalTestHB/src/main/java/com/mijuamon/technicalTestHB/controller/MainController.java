package com.mijuamon.technicalTestHB.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mijuamon.technicalTestHB.model.Price;
import com.mijuamon.technicalTestHB.services.MainService;

@RestController("mainController")
public class MainController {
	
	@Autowired
	@Qualifier("mainService")
	MainService service;
	
	
	@RequestMapping(path="/price", method = RequestMethod.GET)
	public Price getPrice(@RequestParam(value="itemDescription", required = true)String description,
						@RequestParam(value="itemPrice", required = true)BigDecimal price,
						@RequestParam(value="numberOfItems", required = true)Integer numberOfItems,
						@RequestParam(value="state", required = true)String state)
	{
		return new Price(service.calculateTotalAmount(description, price, numberOfItems, state));
	}
	
	

}
