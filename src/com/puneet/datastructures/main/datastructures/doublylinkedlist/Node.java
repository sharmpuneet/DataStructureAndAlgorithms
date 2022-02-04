package com.puneet.datastructures.main.datastructures.doublylinkedlist;

public class Node {

    int data;
    Node next;
    Node previous;

    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public void displayNode() {
        System.out.println("{ " + data + " }");
    }

}
