package com.nishant;//Leetcode Problem No:1672 -- Richest Customer Wealth

import java.util.Arrays;
import java.util.Scanner;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] accounts_arr = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns ; j++){
                accounts_arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(maximumWealth(accounts_arr));
    }

    static int maximumWealth(int[][] accountsArr) {
        int max_val = 0;
        for (int[] ints : accountsArr) {
            int sum = 0;
            for (int col = 0; col < ints.length; col++) {
                sum += ints[col];
            }
            if (sum > max_val)
                max_val = sum;
        }
       return max_val;
    }
}
