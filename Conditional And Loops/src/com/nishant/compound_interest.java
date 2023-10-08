//Calculate compound interest.
//The compound interest formula is:
//
//A = P(1 + r/n)nt
//where:
//A is the future value of the investment (principal + interest)
//P is the principal amount
//r is the annual interest rate
//n is the number of compounding periods per year
//t is the time in years

package com.nishant;

import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter the annual interest rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the number of compounding periods per year: ");
        int n = sc.nextInt();
        System.out.print("Enter the time in years: ");
        int time = sc.nextInt();

        double Amount  = principal * Math.pow((1 + (double)rate / n),(n * time));
        System.out.println("The Amount will be: "+ Amount);

    }
}
