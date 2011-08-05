package com.forrst.oo;


public final class PredicateBuilder<T> 
{
	private final T value;
	private Eval<T> eval = Evals.equals();
	
	public PredicateBuilder(T value) 
	{
		if(value == null){
			throw new IllegalArgumentException("value can't be null");
		}		

		this.value = value;
	}	
	
	public PredicateBuilder<T> eval(Eval<T> eval) 
	{
		this.eval = eval;
	return this;
	}

	public Predicate<T> build()
	{
	return new Predicate<T>() 
			{
			
			@Override
			public boolean apply(T type) {
			return eval.eval(type, value);
			}
		};	
	}
}
