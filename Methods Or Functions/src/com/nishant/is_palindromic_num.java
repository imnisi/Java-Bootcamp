package com.nishant;//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class is_palindromic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(is_palindrome(num))
            System.out.print("It is a palindrome number");
        else
            System.out.print("It is not a palindrome number");
    }

    static boolean is_palindrome(int num){
        int rev_num = 0, rem = 0;
        int temp = num;

        //Reversing the number
        while(temp > 0){
            rem = temp % 10;
            rev_num = rev_num * 10 + rem;
            temp = temp / 10;
        }
        return rev_num == num;
    }
}
