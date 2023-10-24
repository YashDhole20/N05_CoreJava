package org.tnsif.genericinterface;

public class MinMaxImplement<T extends Comparable<T>> implements MinMax {
	T values[];

	@Override
	public Comparable<T> getMinimum() {
	  T min= values[0];
	  for(int i=1;i<values.length;i++) {
		  if(values[0].compareTo(min)<0)
			  min=values[i];
	  }
		return min;
	}
	public MinMaxImplement(T[]values) {
		super();
		this.values=values;
	}
	
	//Generic Function
	@Override
	public Comparable<T> getMaximum() {
		 T max= values[0];
		  for(int i=1;i<values.length;i++) {
			  if(values[0].compareTo(max)>0)
				  max=values[i];
		  }
		return max;
	}
	
}
