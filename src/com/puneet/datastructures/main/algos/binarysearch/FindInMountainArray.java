package com.puneet.datastructures.main.algos.binarysearch;

public class FindInMountainArray {

    // 1. Find the peak element
    // 2. Binary Search in [0,peak element]
    // 3. If not Found binary search in [peak element, end]

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 14, 16, 18, 19, 17, 12, 9, 5, 1};

        System.out.println(findElementInMountainArray(arr, 16));

    }

    static int findElementInMountainArray(int[] arr, int target) {
        int peakIndex = getPeakIndexFromMountainArray(arr);
        int foundIndex = orderAgnosticBinarySearchResult(arr, target, 0, peakIndex);
        if (foundIndex == -1) {
            return orderAgnosticBinarySearchResult(arr, target, peakIndex, arr.length - 1);
        }
        return foundIndex;
    }

    private static int getPeakIndexFromMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                // We are in decreasing part of array
                // this may be the answer but look at left, hence end os not middle-1
                end = middle;
            } else if (arr[middle] < arr[middle + 1]) {
                // We are in ascending part of array
                start = middle + 1; // because it is confirmed that mid+1 is greater than mid
            }
        }
        // Loop will break when start will become equal to end and pointing to largest element because of above checks
        // start and end always try to point to highest so when they point to same index from each side it means that is the highest
        return end;
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
