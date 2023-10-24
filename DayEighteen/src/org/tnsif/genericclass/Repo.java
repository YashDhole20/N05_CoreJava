package org.tnsif.genericclass;

public class Repo<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
