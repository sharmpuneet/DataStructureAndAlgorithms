package com.puneet.datastructures.main.algos.sorting;

import java.util.Arrays;

public class BubbleAndSelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(arr));
       // bubble(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max item in current array and swap it with last element
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }

            // If you did not swap for a particular value of i, that means array is sorted hence stop the program
            if (!swapped) {
                break;
            }

        }
    }
}
