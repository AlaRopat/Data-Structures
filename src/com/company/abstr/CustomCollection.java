package com.company.abstr;

public interface CustomCollection<E> {

	void add(E data);

	void remove(E data);

	int size();

	boolean isEmpty();

	boolean contains(E item);
}
