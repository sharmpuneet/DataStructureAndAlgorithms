package com.puneet.datastructures.main.arrays.problems;

public class PrintInReverseOrder {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5};
        int[] outputArray = reverseArray(inputArray);

        for (int x = 0; x < outputArray.length; x++) {
            System.out.println(outputArray[x]);
        }

    }

    static int[] reverseArray(int[] a) {
        int[] reversedNumbers = new int[a.length];
        int j = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            reversedNumbers[j] = a[i];
            j++;
        }
        return reversedNumbers;
    }
}
