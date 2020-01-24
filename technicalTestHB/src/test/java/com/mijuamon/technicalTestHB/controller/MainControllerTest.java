package com.mijuamon.technicalTestHB.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MainControllerTest {
	  
	@Autowired
	@Qualifier("mainController")
	private MainController controller;
	
	/**
	 * Test with ticket price < 1000 in state RES
	 * 
	 */
	@Test
	public void testGetPriceRES()
	{
		assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(500.0), 1, "RES").getPrice().compareTo(BigDecimal.valueOf(607.5))==0);
		
	}		

}
