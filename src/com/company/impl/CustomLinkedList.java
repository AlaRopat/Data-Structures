package com.company.impl;

import com.company.abstr.CustomCollection;

public class CustomLinkedList implements CustomCollection {

	private Integer count;
	private Node head;

	@Override
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		}
	}

	@Override
	public void remove(Object data) {

	}

	@Override
	public Node get(Integer index) {
		return null;
	}
}
