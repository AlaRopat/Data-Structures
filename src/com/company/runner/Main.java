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
    }
}
