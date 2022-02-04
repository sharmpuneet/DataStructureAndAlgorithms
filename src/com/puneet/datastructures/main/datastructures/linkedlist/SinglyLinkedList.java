package com.puneet.datastructures.main.datastructures.linkedlist;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data, first);
        first = newNode;
    }

    // Insert at the last of the list
    /*public void insertLast(int data) {
        Node currentNode = first;
        Node newNode = new Node(data, null);
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }*/

    // Insert at the last of the list
    public void insertLast(int data) {
        Node currentNode = first;
        Node newNode = new Node(data, null);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Delete From beginning of the list
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
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
