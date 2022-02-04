package com.puneet.datastructures.main.datastructures.linkedlist;

public class App {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(18);
        singlyLinkedList.insertFirst(20);
        singlyLinkedList.insertLast(11);

        singlyLinkedList.displayList();
    }

    public static int listLength(Node node) {
        int length = 0;
        Node currentNode = node;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}
