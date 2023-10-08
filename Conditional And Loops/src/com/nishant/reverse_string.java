//Reverse a string in java.

package com.nishant;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int i = str.length() - 1;
        while(i >= 0){
            System.out.print(str.charAt(i));
            i--;

        }
    }
}
