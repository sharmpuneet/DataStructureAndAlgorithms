package com.puneet.datastructures.main.algos.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindErrorNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};

        System.out.println(findErrorNumbers(arr));
    }

    private static List<Integer> findErrorNumbers(int[] arr) {
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
                result.add(arr[index]);
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
