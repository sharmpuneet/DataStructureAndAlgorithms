package com.puneet.datastructures.main.datastructures.circularlinkedlist;


public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first; //new node is new first
        first = newNode; // first place
    }

    public void insertLast(int data) {
        Node newNode = new Node(data, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; // the next value of last node will point to new node
            last = newNode; // make the new created node to be the last one in the list
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next; // first will point to old's next value
        return temp;
    }

    public void displayList() {
        Node currentNode = first;
        System.out.println("List");
        while (currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

}
