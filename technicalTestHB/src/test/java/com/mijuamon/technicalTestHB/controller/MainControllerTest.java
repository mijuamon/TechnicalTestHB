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
	public void testGetPrice1()
	{
	    assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(500.0), 1, "RES").getPrice().compareTo(BigDecimal.valueOf(607.5))==0);
	    
	}		
	
	/**
	 * Test with ticket price > 1000 and < 2000 in state BAL
	 * 
	 */
	@Test
	public void testGetPrice2()
	{
	    assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(1500.0), 1, "BAL").getPrice().compareTo(BigDecimal.valueOf(1721.265))==0);
	    
	}		
	
	/**
	 * Test with ticket price > 5000 and < 7500 in state CAN with 2 units
	 * 
	 */
	@Test
	public void testGetPrice3()
	{
	    assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(3000.0), 2, "CAN").getPrice().compareTo(BigDecimal.valueOf(5339.7))==0);
	    
	}		
	
	/**
	 * Test with ticket price > 7500 and < 10000 in state cyn with 4 units
	 * 
	 */
	@Test
	public void testGetPrice4()
	{
	    assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(1900.0), 4, "CYN").getPrice().compareTo(BigDecimal.valueOf(6654.636))==0);
	    
	}		
	
	/**
	 * Test with ticket price > 10000 in state TER with 1 unit
	 * 
	 */
	@Test
	public void testGetPrice5()
	{
		assertEquals(true,controller.getPrice("toy", BigDecimal.valueOf(12000.0), 1, "TER").getPrice().compareTo(BigDecimal.valueOf(9450.0))==0);
		
	}		

}
