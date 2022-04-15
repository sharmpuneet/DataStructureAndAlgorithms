package com.puneet.datastructures.main.algos.sorting;

// Arrays distinct Numbers from 0 to n, find the missing number
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 4, 6, 7,9, 3};

        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;

        // Cyclic sort
        while (i < arr.length) {
            int correctIndex = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // return n
        return arr.length;

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
