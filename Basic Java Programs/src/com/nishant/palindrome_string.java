package com.nishant;


//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class palindrome_string {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String name = sc.next();

        int i = 0, j = name.length()-1;

        while(i < j){
            if(name.toLowerCase().charAt(i) != name.toLowerCase().charAt(j)){
                System.out.print("Given string is not a Palindrome string");
                break;
            }
            i++;
            j--;
        }
        if(i >= j)
            System.out.println("Given string is a palindrome string");


    }
}

