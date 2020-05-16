package com.puneet.datastructures;

public class DynamicArrays {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArrays(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.initialCapacity = initialCapacity;
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    private int getSize() {
        return data.length;
    }

    public void add(String value) {

        if (size == initialCapacity) {
            // resize();
        }

        data[size] = value;
        size++;
    }

    public void insert(int index, String value) {
        // Check Size
        if (size == initialCapacity) {
            // resize
        }

        // Copy up
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        // Insert
        data[index] = value;
        size++;
    }

    public void delete(int index) {
        // Copy down
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        // Clear last element of array
        data[size - 1] = null;

        size--;
    }
}
