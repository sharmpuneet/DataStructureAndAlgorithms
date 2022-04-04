package com.puneet.datastructures.main.algos.binarysearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastPositionOfTarget(arr, target)));
    }

    private static int[] firstAndLastPositionOfTarget(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = search(arr, target, true);
        if (result[0] !=-1) {
            result[1] = search(arr, target, false);
        }
        return result;
    }

    static int search(int[] arr, int target, boolean isFirstStartIndex) {
        int answer = -1;
        int start = 0;
        int end = arr.length - 1;
        int middle = 0;

        // Search for first
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                // Answer found
                answer = middle;
                if (isFirstStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return answer;
    }
}
