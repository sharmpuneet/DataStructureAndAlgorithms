package com.puneet.datastructures.main.datastructures.linkedlist;

public class Node {

    int data;
    Node next = null;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void displayNode() {
        System.out.println(data);
    }


}
