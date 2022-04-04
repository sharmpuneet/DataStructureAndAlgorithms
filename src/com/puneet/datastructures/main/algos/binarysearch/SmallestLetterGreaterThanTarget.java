package com.puneet.datastructures.main.algos.binarysearch;

public class SmallestLetterGreaterThanTarget {

    // Ceiling means the smallest element in an array that is greater than or equal to target number

    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'd', 'f', 'j'};
        System.out.println(findCeilingOfaNumber(letters, 'j'));
    }

    static char findCeilingOfaNumber(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;
        int middle = 0;

        while (start <= end) {
            middle = start + (end - start) / 2;
            if (target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
    /* if (start == letters.length) {
            return letters[0];
        } else {
            return letters[start];
        }*/
        return  letters[start % letters.length];
    }
}
