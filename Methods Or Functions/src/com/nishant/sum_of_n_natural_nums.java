package com.nishant;//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class sum_of_n_natural_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = natural_nums(num);
        System.out.print("Sum of first "+num+" natural numbers: "+sum);
    }

    static int natural_nums(int num_val){
        return num_val * (num_val + 1)/ 2;
    }
}
