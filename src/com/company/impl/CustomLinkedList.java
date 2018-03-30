package com.company.impl;

import com.company.abstr.CustomCollection;
import java.util.NoSuchElementException;

public class CustomLinkedList<E> implements CustomCollection <E> {

	private static int size;
	private Node <E> head;
	private Node <E> tail;

	@Override
	public void add(E data) {
		insertAtEnd(data);
	}

	@Override
	public void remove(E data) {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(E item) {
		return false;
	}

	public void insertAtHead(E data) {
		Node <E> newNode = new Node <>(data);
		newNode.setPrev(null);
		if (head != null) {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		} else {
			head = newNode;
		}
		size++;
	}

	public void insertAtEnd(E data) {
		Node <E> newNode = new Node <>(data);
		newNode.setNext(null);
		if (head != null) {
			Node <E> temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			tail = temp;
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		} else {
			tail = newNode;
		}
		size++;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public E getLast() {
		checkNodeExist(tail);
		return tail.getData();
	}

	public E getFirst() {
		checkNodeExist(head);
		return head.getData();
	}

	public E get(Integer index) {
		int count = 0;
		checkNodeExist(head);
		checkElementIndex(index);
		Node <E> temp = head;
		while (count != index) {
			temp = temp.getNext();
		}
		return temp.getData();
	}

	private void checkNodeExist(Node <E> node) {
		if (node == null) {
			throw new NoSuchElementException();
		}
	}

	private boolean isElementIndex(int index) {
		return index >= 0 && index < size;
	}

	private String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

	private void checkElementIndex(Integer index) {
		if (!isElementIndex(index)) {
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
		}
	}
}
