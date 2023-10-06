package com.nishant;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        if(num1 > num2)
            System.out.print(("First number is largest"));
        else if(num1 < num2)
            System.out.println("Second number is largest");
        else
            System.out.println("Bot are equal");
    }
}
