package com.puneet.datastructures.main.datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(Node first, Node last) {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data, null, null);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first; //new node's next field will point to old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data, null, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last; // old last will be new nodes previous
        }
        this.last = newNode; // last field should point to new node
    }

    // assume non empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // there is only one item in the last
            last = null;
        } else {
            first.next.previous = null; // list's first node after deletion will point to null (first.next is new first node)
        }
        first = first.next; // next node to first is new first node, so assigning the reference of old first next node to first variable
        return temp; // return the deleted old first node
    }

    // assume non empty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) { // only one node in the list
            first = null;
        } else {
            last.previous.next = null; // last node's previous node (second last)'s next node (last) made null
        }
        last = last.previous;
        return temp;
    }

    // assume non empty list
    public boolean insertAfter(int key, int data) {
        Node newNode = new Node(data, null, null); // Enter new node data
        Node current = first; // Start iterating all nodes starting from first node
        while (current.data != key) { // loop through the list until key is found
            current = current.next; // move to next item
            if (current == null) { // this means last node is reached and node isn't found
                return false;
            }
        }
        // Node is found if loop exits!!
        if (current == last) { // if last node is reached then insert the new node at last
            current.next = null; // current is last and last node's next should be null
            last = newNode; // new node becomes the last node in the list
        } else {
            newNode.next = current.next; // new node should point to the next node of current node
            current.next.previous = newNode; // new node becomes the previous node of current node's next node
        }
        newNode.previous = current; // current node becomes a previous node for new node
        current.next = newNode; // new node becomes the next node of current node
        return true;
    }

    // assume non empty list
    public Node deleteByKey(int key) {
        Node currentNode = first; // Start iterating all nodes starting from first node
        while (currentNode.data != key) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                return null;
            }
        }
        if (currentNode == first) {
            first = currentNode.next;
        } else {
            currentNode.previous.next = currentNode.next;
        }
        if (currentNode == last) {
            last = currentNode.previous;
        } else {
            currentNode.next.previous = currentNode.previous;
        }
        return currentNode;
    }

    public void displayForward() {
        System.out.println("Doubly Linked List from first to Last");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
            System.out.println();
        }
    }

    public void displayBackward() {
        System.out.println("Doubly Linked List from last to first");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
            System.out.println();
        }
    }

}
