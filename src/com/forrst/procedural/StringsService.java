package com.forrst.procedural;

import java.util.Arrays;
import java.util.List;

public final class StringsService 
{
	private final List<String> strings;
	
	public StringsService() 
	{
		this.strings = load();
	}

	private List<String> load() 
	{		
		return Arrays.asList("Murray", "Markos", "Chris", "Graham", "Stuart", "Steven", "Daniela");
	}

	public String findByValue(String value)
	{
		if(value == null){
			throw new IllegalArgumentException("argument can't be null");
		}
		
		for (String string : this.strings) 
		{
			if(string.equalsIgnoreCase(value)){
				return string;
			}
		}
		
	return null;
	}
	
	public String findByReverse(String reverse)
	{
		if(reverse == null){
			throw new IllegalArgumentException("argument can't be null");
		}
		
		for (String string : this.strings) 
		{
			StringBuilder builder = new StringBuilder(string);
			
			if(builder.reverse().toString().equalsIgnoreCase(reverse)){
				return string;
			}
		}
		
	return null;
	}
}
