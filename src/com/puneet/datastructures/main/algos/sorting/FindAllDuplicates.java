package com.puneet.datastructures.main.algos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 7, 2, 8, 8, 6, 3, 1};

        System.out.println(findAllDuplicateNumbers(arr));
    }

    private static List<Integer> findAllDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println("Sorted list: " + Arrays.toString(arr));

        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                result.add(arr[index]);
            }
        }
        return result;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
