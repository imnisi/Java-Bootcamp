package com.nishant;

//Write a program to input principal, time, and rate (P, T, R) from the user
// and find Simple Interest.

import java.util.Scanner;

public class simple_interest {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter principle amount:");
        int principle_amount = sc.nextInt();
        System.out.print("Enter time:");
        int time = sc.nextInt();
        System.out.print("Enter rate of interest:");
        float rate = sc.nextFloat();
        float simple_interest = (principle_amount * rate * time) / 100;
        System.out.println("Simple interest will be: "+ simple_interest);
    }
}
