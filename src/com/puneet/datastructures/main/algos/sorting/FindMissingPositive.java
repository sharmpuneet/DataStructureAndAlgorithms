package com.puneet.datastructures.main.algos.sorting;

import java.util.Arrays;

public class FindMissingPositive {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findMissingPositive(arr));
    }

    private static int findMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
