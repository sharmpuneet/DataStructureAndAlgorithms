package com.puneet.datastructures.main.algos.binarysearch;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
        System.out.println(search(arr, 2));
    }

    static int search(int[] nums, int target) {
        // Find the pivot
        int pivot = findPivot(nums);

        // If pivot is not found, it means array is not rotated
        if (pivot == -1) {
            // Just do normal binary search
            return orderAgnosticBinarySearchResult(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, that means 2 ascending sorting arrays are there before and after pivot.
        if (nums[pivot] == target) {
            return pivot;
        }

        // All numbers after pivot are smaller than start - VImp to remember
        if (target > nums[0]) {
            return orderAgnosticBinarySearchResult(nums, target, 0, pivot - 1);
        } else if (target < nums[0]) {
            return orderAgnosticBinarySearchResult(nums, target, pivot + 1, nums.length - 1);
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            // 4 cases over here

            // {3, 4, 5, 6, 7, 0, 1, 2}
            // middle is lesser than end check is there to ensure out of bound exception is avoided
            // Only pivot and its next element will be in descending sorted array with length as 2 in rotated array
            // i.e. middle is 7 and next element is 7, 0

            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }

            // middle is greater than start check is there to ensure out of bound exception is avoided
            // Similarly, if middle item is 0 and middle-1 - element before that is greater means middle-1 is pivot
            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }

            // If all the elements after middle element are smaller than start,
            // that means pivot is somewhere in between start and middle,
            // So all the elements after middle can be discarded

            if (arr[middle] <= arr[start]) {
                end = middle - 1;
            } else {
                // This means start is less than middle means pivot will exist after middle otherwise it would have been found till now
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearchResult(int[] inputArray, int target, int start, int end) {
        boolean isAscendingSortedArray = inputArray[start] < inputArray[end];
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (inputArray[middle] == target) {
                return middle;
            }

            if (isAscendingSortedArray) {
                if (target > inputArray[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (target > inputArray[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
