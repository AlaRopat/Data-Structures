package com.company.runner;

import com.company.impl.CustomLinkedList;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList <Integer> list = new CustomLinkedList <>();
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(5);
        list.add(7);
        list.add(9);
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        list.remove(2);
        list.remove(3);
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        list.deleteFirst();
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Does list contain 5 ? " + list.contains(5));
        System.out.println("Does list contain 7 ? " + list.contains(7));
        System.out.println("First item: " + list.getFirst());
        System.out.println("Last item: " + list.getLast());
        list.deleteFirst();
        list.deleteFirst();
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        list.insertAtHead(2);
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
