package com.puneet.datastructures.main;

import com.puneet.datastructures.main.datastructures.arrays.DynamicArrays;
import com.puneet.datastructures.main.datastructures.queue.Queue;
import com.puneet.datastructures.main.datastructures.stacks.StackOfLongs;
import com.puneet.datastructures.main.datastructures.stacks.StackOfStrings;

public class Main {

    public static void main(String[] args) {
      //  testStacks(5);
     //   System.out.println(reverseString("Puneet"));
        testQueue(5);
    }

    public void testArrays() {
        // Not a dynamic array, can hold up to 7 integers
        int[] intArray = new int[7];

        DynamicArrays dynamicArrays = new DynamicArrays(10);
    }

    public static void testStacks(int size) {
        StackOfLongs stackOfLongs = new StackOfLongs(size);
        for (int i = 0; i < 1; i++) {
            stackOfLongs.push(i + 10);
        }

        while (!stackOfLongs.isEmpty()) {
            long value = stackOfLongs.pop();
            System.out.println(value);
        }
    }

    public static String reverseString(String s) {
        char[] characters = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        StackOfStrings stackOfStrings = new StackOfStrings(characters.length);
        for (char c: characters) {
            stackOfStrings.push(c);
        }
        while (!stackOfStrings.isEmpty()) {
            char cr = stackOfStrings.pop();
            sb.append(cr);
        }
        return sb.toString();
    }

    public static void testQueue(int size) {
        Queue queue = new Queue(size);
        queue.insert(1);
        queue.insert(3);
        queue.insert(2);
        queue.insert(11);
        queue.insert(31);
        queue.insert(10);
        queue.insert(20);
        queue.insert(22);

        queue.view();
    }
}
