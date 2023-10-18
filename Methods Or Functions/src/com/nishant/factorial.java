package com.nishant;//Write a program to print the com.nishant.factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        factorial_func(number);
    }

    static void factorial_func(int num){
        long fact = 1;
        while(num > 1){
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial: "+fact);
    }
}
