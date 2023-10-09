//Perfect Number in java.
// In other words, a perfect number is a number for which the sum of its factors (excluding itself)
// is equal to the number itself.


package com.nishant;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1, sum = 0;

        while( i <= num / 2){
            if(num % i == 0){
                   sum = sum + i;
            }
            i++;
        }
        if(sum == num)
            System.out.print("It is a perfect number.");
        else
            System.out.print("It is not a perfect number");
    }
}
