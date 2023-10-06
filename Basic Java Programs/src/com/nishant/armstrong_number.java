package com.nishant;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();



        while (num1 <= num2) {
            int val = num1;
            int sum = 0;
            int rem;

            while (val > 0) {
                rem = val % 10;
                sum = sum + rem * rem * rem;
                val = val / 10;
            }
            if (sum == num1)
                System.out.print(num1 + ",");

            num1++;

        }
    }
}
