package com.puneet.datastructures.main.datastructures.queue;

public class Queue {

    private int maxSize; //initializes the number of slots
    private long[] queueArray; // slots to maintain the data
    private int front; // index position for the element in the front
    private int rear; // index position for the element at the back
    private int numberOfItems; // counter to maintain number of items in the queue

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        front = 0;
        rear = -1; // There is no items in the array yet to be considered as last element
        numberOfItems = 0;
    }

    public void insert(long item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = item;
        numberOfItems++;
    }

    public long remove() { // remove item from front of the queue
        long temp = queueArray[front];
        front++;
        if (front == maxSize) { // It means all elements are removed
            front = 0; // set back to 0th index so that entire array space is utilized
        }
        numberOfItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public long peekFront() {
        return queueArray[front];
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }
}
