package com.puneet.datastructures.main.datastructures.doublylinkedlist;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(null, null);
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertLast(50);
        doublyLinkedList.insertAfter(10, 20);
        doublyLinkedList.insertAfter(20, 30);
        doublyLinkedList.insertAfter(50, 60);
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteByKey(10);
        doublyLinkedList.displayBackward();
    }
}
