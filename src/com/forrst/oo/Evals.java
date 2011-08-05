package com.forrst.oo;

public final class Evals 
{
	private static final Eval<Object> EQUALS = new Eval<Object>() {
		
		@Override
		public boolean eval(Object thiz, Object that) {
		return thiz.equals(that);
		}
	};

	public static final Eval<String> EQUALS_IGNORE_CASE = new Eval<String>() {
		
		@Override
		public boolean eval(String thiz, String that) {
		return thiz.equalsIgnoreCase(that);
		}
	};
	
	public static final Eval<String> EQUALS_REVERSE_IGNORE_CASE = new Eval<String>() {
		
		@Override
		public boolean eval(String thiz, String that) 
		{
			StringBuilder builder = new StringBuilder(thiz);
			
		return EQUALS_IGNORE_CASE.eval(builder.reverse().toString(), that);
		}
	};
	
	@SuppressWarnings("unchecked")
	public static <T> Eval<T> equals(){
	return (Eval<T>) EQUALS;
	}
}
