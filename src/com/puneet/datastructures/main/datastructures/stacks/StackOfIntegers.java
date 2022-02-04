package com.puneet.datastructures.main.datastructures.stacks;

public class StackOfIntegers {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackOfIntegers(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int val) {
        if (!isFull()) {
            top++;
            stackArray[top] = val;
        } else {
            System.out.println("Stack is full");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
