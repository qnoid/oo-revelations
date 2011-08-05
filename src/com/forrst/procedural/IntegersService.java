package com.forrst.procedural;

import java.util.Arrays;
import java.util.List;

public final class IntegersService 
{
	private final List<Integer> strings;
	
	
	public IntegersService() 
	{
		this.strings = load();
	}

	private List<Integer> load() {		
	return Arrays.asList(2, 3, 5, 7, 13, 17, 19, 23);
	}

	public Integer findByValue(Integer value)
	{
		if(value == null){
			throw new IllegalArgumentException("value can't be null");
		}
		
		for (Integer integer : this.strings) 
		{
			if(integer == value){
				return integer;
			}
		}
		
	return null;
	}	
}
