package com.forrst.oo;

import java.util.List;

public final class Service<T> 
{
	public static <T> Service<T> newService(List<T> values) {
	return new Service<T>(values);
	}
	
	public List<T> values;

	public Service(List<T> values) 
	{
		this.values = values;
	}
	
	public T apply(Predicate<T> predicate) 
	{
		for (T type : values) 
		{
			if(predicate.apply(type)){
			return type;
			}
		}

	throw new ObjectNotFoundException();
	}
}
