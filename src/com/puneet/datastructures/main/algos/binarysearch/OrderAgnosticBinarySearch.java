package com.puneet.datastructures.main.algos.binarysearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] ascendingArray = {-19, -12, 0, 1, 4, 5, 6, 8, 12, 22, 34, 44, 243, 4422};
        int[] descendingArray = {19, 12, 10, 8, 7, 4};
        System.out.println(orderAgnosticBinarySearchResult(descendingArray, 4));
    }

    // Return the index
    // Return -1 if it does not exist
    public static int orderAgnosticBinarySearchResult(int[] inputArray, int target) {
        int start = 0;
        int end = inputArray.length - 1;
        boolean isAscendingSortedArray = inputArray[start] < inputArray[end];
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (inputArray[middle] == target) {
                return middle;
            }

            if (isAscendingSortedArray) {
                if (target > inputArray[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (target > inputArray[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
