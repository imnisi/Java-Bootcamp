package com.nishant;//Java Program to sort the elements of an array in ascending
//order

import java.util.Arrays;
import java.util.Scanner;

public class sort_array_in_ascendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(sortArrayAscendingOrder(num_arr, len_arr)));
    }

    static int[] sortArrayAscendingOrder(int[] numArr, int lenArr) {
        int temp;
        for(int i = 0; i < lenArr - 1; i++){
            for(int j = i + 1; j < lenArr; j++){
               if(numArr[i] > numArr[j]){
                   temp = numArr[i];
                   numArr[i] = numArr[j];
                   numArr[j] = temp;
               }
            }
        }
       return numArr;
    }
}
