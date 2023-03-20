package com.puneet.datastructures.main.datastructures.arrays.problems;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 2, 9};
        //   System.out.println(Arrays.toString(arr));
        //   swap(arr, 1, 3);

        //     System.out.println(Arrays.toString(arr));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }
}
