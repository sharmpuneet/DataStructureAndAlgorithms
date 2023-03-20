package com.puneet.datastructures.main.algos.binarysearch;

public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 14, 16, 18, 21, 19, 17, 12, 9, 5, 1};
        System.out.println(getPeakIndexFromMountainArray(arr));
    }

    private static int getPeakIndexFromMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start)/2;
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
}
