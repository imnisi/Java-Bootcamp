package com.nishant;//Leetcode problem No: 1365 -- How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;
import java.util.Scanner;

public class How_Many_Nums_Are_Smaller_Than_Current_Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] nums_arr = new int[len];
        for(int i = 0; i < len; i++){
            nums_arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums_arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans= new int[nums.length];
        for(int i = 0; i < nums.length; i++){
             int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count++;
                }
            }
             ans[i] = count;
        }
        return ans;
    }
}
