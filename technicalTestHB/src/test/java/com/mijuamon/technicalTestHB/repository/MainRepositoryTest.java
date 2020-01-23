package com.mijuamon.technicalTestHB.repository;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainRepository.class})
public class MainRepositoryTest {
	
	@Test
	public void getInstanceTest()
	{
		assertEquals(MainRepository.getInstance().getClass(), MainRepository.class);
	}
	
	@Test
	public void getTaxesTest()
	{
		assertNotEquals(MainRepository.getInstance().getTaxes(),null);
	}
	
	@Test
	public void getSpecialTaxesTest()
	{
		assertNotEquals(MainRepository.getInstance().getSpecialTaxes(),null);
	}
	
	@Test
	public void getDiscountsTaxesTest()
	{
		assertNotEquals(MainRepository.getInstance().getDiscounts(),null);
	}

}
