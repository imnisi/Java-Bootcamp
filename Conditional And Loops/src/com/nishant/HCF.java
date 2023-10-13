//HCF of two numbers.

package com.nishant;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int rem;

        if(num1 <= num2){
            while(num2 % num1 != 0){
                rem = num2 % num1;
                num2 = num1;
                num1 = rem;
            }
            System.out.println("The HCF of given numbers is: "+num1);
        }else
            System.out.println("num2 should be greater than num1");

    }
}
