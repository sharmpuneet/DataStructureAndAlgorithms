package com.puneet.datastructures.main.algos.linearsearch;

public class LinearSearch {

    private int[] inputArray;

    public static int linearSearchValue(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == target) {
                return i;

            }
        }
        return -1;
    }
}
