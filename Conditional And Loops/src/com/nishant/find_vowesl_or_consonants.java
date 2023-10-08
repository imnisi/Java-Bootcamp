//1. Java Program to find Vowels Or Consonants

package com.nishant;

import java.util.Scanner;

public class find_vowesl_or_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if( ch == 'a'  || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' ||
                ch =='A' || ch == 'E'  || ch == 'I'|| ch == 'O' || ch == 'U'){
            System.out.print("It is a vowel");
        }else
            System.out.print("It is a consonant");
    }
}
