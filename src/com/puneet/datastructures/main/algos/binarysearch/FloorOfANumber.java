package com.puneet.datastructures.main.algos.binarysearch;

public class FloorOfANumber {

    // Floor means the greatest element in an array that is smaller than or equal to target number

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 14, 16, 18, 21};
        System.out.println(floorOfANumber(arr, 15));
    }

    private static int floorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle = 0;
        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return arr[middle];
            }
        }
        return arr[end];
    }
}
