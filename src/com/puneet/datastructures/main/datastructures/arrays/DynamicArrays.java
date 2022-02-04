package com.puneet.datastructures.main.datastructures.arrays;

public class DynamicArrays implements DynamicArraysContract {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArrays(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.initialCapacity = initialCapacity;
    }

    @Override
    public String get(int index) {
        return (String) data[index];
    }

    @Override
    public void set(int index, String value) {
        data[index] = value;
    }

    @Override
    public int size() {
        return data != null ? data.length : 0;
    }

    @Override
    public void add(String value) {

        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

    @Override
    public void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    @Override
    public void insert(int index, String value) {
        // Check Size
        if (size == initialCapacity) {
            resize();
        }

        // Copy up
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        // Insert
        data[index] = value;
        size++;
    }

    @Override
    public void delete(int index) {
        // Copy down
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        // Clear last element of array
        data[size - 1] = null;

        size--;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void print() {
        for (int i = 0; i < initialCapacity; i++) {
            System.out.println("Array Items: " + data[i]);
        }
    }

    @Override
    public boolean isContains(String value) {
        for (int i = 0; i < initialCapacity; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }
}
