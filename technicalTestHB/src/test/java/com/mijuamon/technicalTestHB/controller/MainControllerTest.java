package com.mijuamon.technicalTestHB.controller;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainController.class})
public class MainControllerTest {
	
	@Autowired
	@Qualifier("MainController")
	private MainController controller;
	
	/**
	 * Test with ticket price < 1000 in state RES
	 * 
	 */
	@Test
	public void testGetPriceRES()
	{
		assertEquals(BigDecimal.valueOf(607.5),controller.getPrice("toy", BigDecimal.valueOf(500.0), 1, "RES").getPrice());
		
	}		

}
