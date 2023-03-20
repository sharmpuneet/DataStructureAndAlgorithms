package com.puneet.datastructures.main.algos.binarysearch;

public class PositionOfElementInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 14, 16, 18, 21, 1626, 3738, 3434763};
        System.out.println(findPositionWithRange(arr, 4));
    }

    static int findPositionWithRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // new start
            // double the box and calculate the box range
            end = end + (end - (start - 1)) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int middle = 0;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
