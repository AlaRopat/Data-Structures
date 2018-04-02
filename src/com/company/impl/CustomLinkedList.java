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
		deleteByData(data);
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
		checkNodeExist(head);
		Node <E> n = head;
		while (n.getNext() != null) {
			if (n.getData() == item) {
				return true;
			}
			n = n.getNext();
		}
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

	public void deleteFirst() {
		checkNodeExist(head);
		Node <E> del = head;
		if (del.getNext() == null) {
			head = null;
			tail = null;
		} else {
			Node <E> next = del.getNext();
			next.setPrev(null);
			head = next;
		}
		size--;
	}

	public void deleteLast() {
		checkNodeExist(tail);
		Node <E> n = tail;
		if (n.getPrev() == null) {
			tail = null;
			head = null;
		} else {
			Node <E> prev = n.getPrev();
			prev.setNext(null);
			tail = prev;
		}
		size--;
	}

	private void deleteByData(E data) {
		Node <E> n = head;
		Node <E> del = null;
		while (n.getNext() != null) {
			if (n.getData() == data) {
				del = n;
				break;
			}
			n = n.getNext();
		}
		checkNodeExist(del);
		Node <E> prev = del.getPrev();
		Node <E> next = del.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
	}

	public void print() {
		Node <E> temp = head;
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
