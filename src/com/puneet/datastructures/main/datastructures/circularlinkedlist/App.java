package com.puneet.datastructures.main.datastructures.circularlinkedlist;

public class App {

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(5);
        circularLinkedList.insertFirst(10);
        circularLinkedList.insertFirst(15);
        circularLinkedList.insertFirst(18);
        circularLinkedList.insertFirst(20);
        circularLinkedList.insertLast(11);

        circularLinkedList.displayList();
    }
}
