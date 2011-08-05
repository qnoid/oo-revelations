package com.forrst.procedural;

import junit.framework.Assert;

import org.junit.Test;

import com.forrst.procedural.IntegersService;

public class IntegersServiceTest {

	@Test
	public void findByValue() 
	{
		IntegersService service = new IntegersService();
		
		Integer actual = service.findByValue(2);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(Integer.valueOf(2), actual);
	}

}
