package com.nishant;//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class vote_eligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        is_legible(age);
    }

    static void is_legible(int val){
        if(val >= 18)
            System.out.print("You are eligible for vote");
        else
            System.out.print("Sorry! You are not eligible for vote.");
    }
}
