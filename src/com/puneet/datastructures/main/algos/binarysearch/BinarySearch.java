package com.puneet.datastructures.main.algos.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {-19, -12, 0, 1, 4, 5, 6, 8, 12, 22, 34, 44, 243, 4422};
        System.out.println(binarySearchResult(a, 44));
    }

    // Return the index
    // Return -1 if it does not exist
    public static int binarySearchResult(int[] inputArray, int target) {
        int start = 0;
        int end = inputArray.length - 1;
        int middle;
        while (start <= end) {
            // Find middle element
         //   middle = (start + end) / 2; - this formula may exceed int range if input is very large
            middle = start + (end-start)/2;
            if (target < inputArray[middle]) {
                end = middle - 1;
            } else if (target > inputArray[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
