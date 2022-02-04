package com.puneet.datastructures.main.algos.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 8, 12, 22, 34, 44, 243, 4422};
        System.out.println(binarySearchResult(a, 44223));
    }

    public static int binarySearchResult(int[] inputArray, int target) {
        int p = 0;
        int r = inputArray.length - 1;
        int q;
        while (p <= r) {
            q = (p + r) / 2;
            if (inputArray[q] > target) {
                r = q - 1;
            } else if (inputArray[q] < target) {
                p = q + 1;
            } else {
                return q;
            }
        }
        return -1;
    }
}
