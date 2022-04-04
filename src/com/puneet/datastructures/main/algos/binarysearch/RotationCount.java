package com.puneet.datastructures.main.algos.binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        return findPivot(arr) + 1;
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

    static int findPivotWithDuplicates(int[] arr) {
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

            // If elements at middle, start, end are equal, skip the duplicates


            if (arr[middle] == arr[start] && arr[middle] == arr[end]) {
                // skip the duplicates
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[middle] || (arr[start] == arr[middle] && arr[middle] > arr[end])) {
                // Left side is sorted then pivot is in right
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
