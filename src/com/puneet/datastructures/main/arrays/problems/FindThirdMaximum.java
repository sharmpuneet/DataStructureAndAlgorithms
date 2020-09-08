package com.puneet.datastructures.main.arrays.problems;

public class FindThirdMaximum {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5};

        System.out.println(thirdMax(inputArray));

    }

    static int thirdMax(int[] numbers) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : numbers) {
            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }
        if (thirdMax == null) {
            return max;
        }
        return thirdMax;
    }
}
