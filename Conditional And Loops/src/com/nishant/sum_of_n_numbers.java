//Sum Of N Numbers.

package com.nishant;

import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = num * (num + 1) / 2;
        System.out.print("Sum of "+num+" numbers: "+sum);


    }
}
