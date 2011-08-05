package com.forrst.oo;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void equalsIgnoreCase() 
	{
		final String value = "Markos";
		
		Service<String> service = 
				new Service<String>( Arrays.asList(value) );
		
		Predicate<String> equals = 
				new PredicateBuilder<String>(value)
				.eval(Evals.EQUALS_IGNORE_CASE)
				.build();
		
		String actual = service.apply(equals);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(value, actual);
	}
	
	@Test
	public void equalsReverseIgnoreCase() 
	{
		String value = "Markos";
		String reverse = "sokraM";
		
		Service<String> service = new Service<String>( Arrays.asList(value) );
		
		Predicate<String> equals = 
				new PredicateBuilder<String>(reverse)
				.eval(Evals.EQUALS_REVERSE_IGNORE_CASE)
				.build();
		
		String actual = service.apply(equals);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(value, actual);
	}

	@Test
	public void equals() 
	{
		final Integer value = 2;
		
		Service<Integer> service = new Service<Integer>( Arrays.asList(value) );
		
		Predicate<Integer> equals = 
				new PredicateBuilder<Integer>(value).build();

		Integer actual = service.apply(equals);
		
		Assert.assertNotNull(actual);
		Assert.assertEquals(value, actual);
	}	
}
