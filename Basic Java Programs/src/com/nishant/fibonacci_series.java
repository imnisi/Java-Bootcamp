package com.nishant;

//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0, i = 2;
        System.out.print(a+","+b+",");

        while(i < n){
            c = a + b;
            System.out.print(c +",");
            a = b;
            b = c;
            i++;
        }

    }
}
