package com.mijuamon.technicalTestHB.controller;


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
	
	@Test
	public void testGetPrice1()
	{
		
	}
	
	
	@Test
	public void testGetPrice2()
	{
		
	}

}
