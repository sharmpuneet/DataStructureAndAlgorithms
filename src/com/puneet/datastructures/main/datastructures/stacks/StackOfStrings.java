package com.puneet.datastructures.main.datastructures.stacks;

public class StackOfStrings {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackOfStrings(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char c) {
        if (!isFull()) {
            top++;
            stackArray[top] = c;
        } else {
            System.out.println("Stack is full");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        } else {
            System.out.println("Stack is Empty");
            return 'E';
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
