package com.nishant;//Leetcode Problem No:1470 -- Shuffle the Array

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        int[] nums_arr = new int[len];

        for(int i = 0; i < len; i++){
            nums_arr[i] = sc.nextInt();
        }
        System.out.print("Enter the shuffling index: ");
        int index = sc.nextInt();

        System.out.print(Arrays.toString(shuffle(nums_arr, index)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];

        int  i = 0;
        int  j = 0;
        while(n < nums.length){
            ans[i] = nums[j];
            ans[++i] = nums[n];
            n++;
            j++;
            i++;
        }
        return ans;
    }
}
