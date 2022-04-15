package com.puneet.datastructures.main.algos.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersMissingInArray {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findMissingNumbers(arr));
    }

    private static List<Integer> findMissingNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Get a list of missing numbers
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index] - 1) {
                result.add(index + 1);
            }
        }
        return result;

    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
