package com.puneet.datastructures.main.algos.binarysearch;

import java.util.Arrays;

public class RowColumnMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 50;
        System.out.println(Arrays.toString(search(arr1, target)));

    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] < target) {
                row++;
            } else if (matrix[row][column] > target) {
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}
