//Subtract the Product and Sum of Digits of an Integer (providing positive integer).

package com.nishant;

import java.util.Scanner;

public class differ_prod_and_sum_of_digits {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int rem, sum = 0, prod = 1, result;

        if(num == 0)
            result = 0;
        while(num > 0){
            rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        result = prod - sum;
        System.out.print("Difference between the product and sum of digits of integer: "+result);
    }

}
