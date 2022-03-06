package com.puneet.datastructures.main.datastructures.arrays.problems;

public class MaxValues {

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 12, 166, 5, 6, 3, 5, 9};
        System.out.println(maxOfArray(arr));
        System.out.println(maxOfRange(arr, 3,6));
    }

    private static int maxOfArray(int[] arr) {
        int temp = 0;
        if (arr == null) {
            return -1;
        }
        if (arr.length==0) {
            return -1;
        }
        for (int val : arr) {
            if (val > temp) {
                temp = val;
            }
        }
        return temp;
    }

    private static int maxOfRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int temp = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
