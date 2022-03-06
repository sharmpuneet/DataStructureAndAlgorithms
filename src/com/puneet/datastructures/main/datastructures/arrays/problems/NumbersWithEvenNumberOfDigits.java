package com.puneet.datastructures.main.datastructures.arrays.problems;

public class NumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] arr = {12, 345, 4, 6, 1234, 768, 76, 7896, 123, 14, -12, -567, -10};

        System.out.println(numberOfEvenDigits(arr));
    }

    private static int numberOfEvenDigits(int[] arr) {
        int result = 0;
        for (int num : arr) {
            if (isEven(countNumberOfDigits(num))) {
                result++;
            }
        }
        return result;
    }

    static boolean isEven(int num) {
        // Check if number is even
        return num % 2 == 0;
    }

    private static int countNumberOfDigits(int num) {
        // Count number of digits in a number
        int count = 0;
        // Handle negative number
        if (num < 0) {
            num = num * -1;
        }
        // Handle if number is 0
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    private static int optimizeWayOfCountingDigits(int num) {
        // Handle negative number
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
