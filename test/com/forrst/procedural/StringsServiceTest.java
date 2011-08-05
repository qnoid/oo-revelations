package com.forrst.procedural;

import junit.framework.Assert;

import org.junit.Test;

import com.forrst.procedural.StringsService;

public class StringsServiceTest 
{
	@Test
	public void findByValue() throws Exception 
	{
		String value = "Markos";
		
		StringsService service = new StringsService();		
		String actual = service.findByValue(value);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(value, actual);
	}
	
	@Test
	public void findByCharacters() throws Exception 
	{
		StringsService service = new StringsService();
		
		String actual = service.findByReverse("sokraM");
				
		Assert.assertNotNull(actual);
		Assert.assertEquals("Markos", actual);
	}
}
