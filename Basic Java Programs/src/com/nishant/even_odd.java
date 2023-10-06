package com.nishant;

//Write a program to print whether a number is even or odd,
// also take input from the user.

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("It is an even number");
        }
        else{
            System.out.print("It is an odd number");
        }

    }
}