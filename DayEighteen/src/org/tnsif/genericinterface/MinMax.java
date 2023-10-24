package org.tnsif.genericinterface;

public interface MinMax<T extends Comparable<T>> {

	T getMinimum();
	T getMaximum();
}
