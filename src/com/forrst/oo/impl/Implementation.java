package com.forrst.oo.impl;

import java.util.Arrays;

import com.forrst.oo.Service;

public class Implementation 
{
	public static Service<String> newStringService() 
	{
	return Service.newService( 
			Arrays.asList(
					"Murray", 
					"Markos", 
					"Chris", 
					"Graham", 
					"Stuart", 
					"Steven", 
					"Daniela") ); 
	}
	
	public static Service<Integer> newIntegerService() {
	return Service.newService( Arrays.asList(2, 3, 5, 7, 13, 17, 19, 23) ); 
	}
}
