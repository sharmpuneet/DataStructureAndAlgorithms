package com.puneet.datastructures.main.algos.sorting;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 7, 8, 6, 3, 1};

        System.out.println(findDuplicateNumber(arr));
    }

    private static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println("Sorted list: "+ Arrays.toString(arr));

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }

        return -1;

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
