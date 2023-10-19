//Java to program Find 2nd smallest number in an array.

package com.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class second_smallest_element_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        int second_smallest = secondSmallestElement(num_arr, len_arr);
        System.out.print("Second smallest number in array: "+ second_smallest);
    }

    static int secondSmallestElement(int[] numArr, int lenArr) {
        //First Approach: using sort method.
//        Arrays.sort(numArr);
//        return numArr[1];

        //Second Approach: using brute force.
        int smallest = Integer.MAX_VALUE;
        int n = 2;
        int j = 0;
        while (n > 0) {
            smallest = Integer.MAX_VALUE;
            for (int i = 0; i < lenArr; i++) {
                if (smallest > numArr[i]) {
                    smallest = numArr[i];
                    j = i;
                }
            }
            numArr[j] = Integer.MAX_VALUE;
            n--;
        }
        return smallest;
    }
}
