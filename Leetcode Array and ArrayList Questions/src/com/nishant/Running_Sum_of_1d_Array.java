package com.nishant;//Leetcode Problem No:1480 -- Running Sum of 1d Array

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        int[] nums_arr = new int[len];
        for(int i = 0; i < len; i++){
            nums_arr[i]  = sc.nextInt();
        }
        System.out.print(Arrays.toString(runningSum(nums_arr)));
    }

    static int[] runningSum(int[] nums) {
        int len = nums.length;
        int i = 0;
        int sum = 0;
        int[] runningSum = new int[len];

        while(i < len){
           sum += nums[i];
           runningSum[i] = sum;
           i++;
        }
        return runningSum;
    }
}

