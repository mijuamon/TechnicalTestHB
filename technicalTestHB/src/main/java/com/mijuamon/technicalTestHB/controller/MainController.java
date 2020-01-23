package com.mijuamon.technicalTestHB.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("MainController")
public class MainController {
	
	@RequestMapping("/price")
	public void getPrice(@RequestParam(value="itemDescription", required = true)String description,
						@RequestParam(value="itemPrice", required = true)BigDecimal price,
						@RequestParam(value="numberOfItems", required = true)Integer numberOfItems,
						@RequestParam(value="state", required = true)String state)
	{
		System.out.println("Hola mundo");
	}
	
	

}
