//Java Program to Remove Duplicate Elements in an array

package com.nishant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        System.out.print(removeDuplicates(num_arr, len_arr));
    }

    static ArrayList<Integer> removeDuplicates(int[] numArr, int lenArr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lenArr; i++) {
             if(!list.contains(numArr[i]))
                 list.add(numArr[i]);

        }
        return list;
    }
}
