//Sum of digits of number.

package com.nishant;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rem, sum = 0;

        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.print("Sum of digits: "+sum);
    }
}
