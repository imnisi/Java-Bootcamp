package com.nishant;//Leetcode Problem No:1929 -- Concatenation of Array

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len  = sc.nextInt();

        int[] nums_arr = new int[len];

        for(int i = 0; i < len; i++){
            nums_arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(getConcatenation(nums_arr)));
    }
    static int[] getConcatenation(int[] nums){
        int i = 0;
        int len = nums.length;
        int[] ans = new int[2 * len];
        while(i < len){
             ans[i] = nums[i];
             ans[i + len] = nums[i];
             i++;
        }
        return ans;
    }
}

