package com.nishant;//ava Program to print the smallest and largest element in an array

import java.util.Scanner;

public class smallest_and_largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        smallestAndLargestNum(num_arr, len_arr);
    }

  static void smallestAndLargestNum(int[] numArr, int lenArr) {
        int min = numArr[0];
        int max = numArr[0];
        for(int num : numArr){
            if(max < num)
                max = num;
            if(min > num)
                min = num;
        }
      System.out.println("Largest number of array: "+max);
      System.out.println("Smallest number of array: "+min);
    }
}
