package com.nishant;//Leetcode problem No: 1512 -- Number of Good Pairs

import java.util.Scanner;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len =  sc.nextInt();

        int[] nums_arr = new int[len];

        for(int i = 0; i < len; i++){
            nums_arr[i] = sc.nextInt();
        }
        System.out.print(numIdenticalPairs(nums_arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j)
                    count++;
            }

        }
        return count;
    }
}
