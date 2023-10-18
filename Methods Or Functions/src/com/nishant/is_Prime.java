package com.nishant;//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(is_prime(num))
            System.out.print("It is a prime number.");
        else
            System.out.print("It is not a prime number.");

    }

    static boolean is_prime(int num){
        if(num < 2)
            return false;
        int i = 2;
        while(i * i < num){
            if(num % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
