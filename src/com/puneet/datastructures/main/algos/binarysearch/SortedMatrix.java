package com.puneet.datastructures.main.algos.binarysearch;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 50;
    }

    // search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target) {
        while (columnStart <= columnEnd) {
            int middle = columnStart + (columnEnd - columnStart) / 2;
            if (target == matrix[row][middle]) {
                return new int[]{row, middle};
            } else if (target > matrix[row][middle]) {
                columnStart = middle + 1;
            } else if (target < matrix[row][middle]) {
                columnEnd = middle - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length; // Assuming matrix not empty

        if (row == 1) {
            binarySearch(matrix, 0, 0,column-1,target);
        }

        int rowStart =0;
        int rowEnd = row-1;
        int columnMiddle = column/2;

        // Run the loop till 2 row are remaining
        while (rowStart<(rowEnd-1)) {
            int mid = rowStart + (rowEnd-rowStart)/2;
            if (matrix[mid][columnMiddle]==target) {
                return new int[]{mid, columnMiddle};
            }
            if (matrix[mid][columnMiddle]<target) {
                //ignore above rows
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // now we have 2 columns
        // check whether target is in the column of two rows
        if (matrix[rowStart][columnMiddle] == target) {
            return new int[] {rowStart,columnMiddle};
        }
        if (matrix[rowStart+1][columnMiddle] == target) {
            return new int[] {rowStart+1,columnMiddle};
        }

        // search in 1st
        return new int[]{-1,-1};
    }
}
