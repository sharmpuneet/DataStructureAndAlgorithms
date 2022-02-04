package com.puneet.datastructures.main.datastructures.arrays;

public interface DynamicArraysContract {
    String get(int index);

    void set(int index, String value);

    int size();

    void add(String value);

    void resize();

    void insert(int index, String value);

    void delete(int index);

    boolean isEmpty();

    void print();

    boolean isContains(String value);
}
