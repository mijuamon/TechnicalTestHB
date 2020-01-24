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
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(500.0), 1, "RES").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(607.5);
	    assertEquals(true,received.compareTo(expected)==0);
	    
	}		
	
	/**
	 * Test with ticket price > 1000 and < 2000 in state BAL
	 * 
	 */
	@Test
	public void testGetPrice2()
	{
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(1500.0), 1, "BAL").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(1721.265);
	    assertEquals(true,received.compareTo(expected)==0);	    
	}		
	
	/**
	 * Test with ticket price > 5000 and < 7500 in state CAN with 2 units
	 * 
	 */
	@Test
	public void testGetPrice3()
	{
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(3000.0), 2, "CAN").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(5339.7);
	    assertEquals(true,received.compareTo(expected)==0);
	    
	}		
	
	/**
	 * Test with ticket price > 7500 and < 10000 in state cyn with 4 units
	 * 
	 */
	@Test
	public void testGetPrice4()
	{
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(1900.0), 4, "CYN").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(6654.636);
	    assertEquals(true,received.compareTo(expected)==0);
	    
	}		
	
	/**
	 * Test with ticket price > 10000 in state TER with 1 unit
	 * 
	 */
	@Test
	public void testGetPrice5()
	{
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(12000.0), 1, "TER").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(9450.0);
	    assertEquals(true,received.compareTo(expected)==0);
	    
	}		
	
	/**
	 * Test with ticket price with special tax
	 * 
	 */
	@Test
	public void testGetPrice6()
	{
	    BigDecimal received=controller.getPrice("tobacco", BigDecimal.valueOf(500.0), 1, "RES").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(857.5);
	    assertEquals(true,received.compareTo(expected)==0);		
	}
	
	
	/**
	 * Test with unknow state
	 * 
	 */
	@Test
	public void testGetPrice7()
	{
	    BigDecimal received=controller.getPrice("toy", BigDecimal.valueOf(500.0), 1, "ANOTHER").getPrice();
	    BigDecimal expected=BigDecimal.valueOf(607.5);
	    assertEquals(true,received.compareTo(expected)==0);
	    
	}	

}
