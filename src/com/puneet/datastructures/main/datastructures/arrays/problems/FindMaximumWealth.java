package com.puneet.datastructures.main.datastructures.arrays.problems;

public class FindMaximumWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {4,5,6}, {4,6,9}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            int currentWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                currentWealth = currentWealth + accounts[person][account];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}

