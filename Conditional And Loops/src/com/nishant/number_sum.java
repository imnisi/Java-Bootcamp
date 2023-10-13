//Write a program to print the sum of negative numbers,sum of positive even numbers and the sum
// of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
package com.nishant;

import java.util.Scanner;

public class number_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");

        int sum_of_negative_num = 0;
        int sum_of_positive_even_num = 0;
        int sum_of_positive_odd_num = 0;

        int num;
        do {
            num = sc.nextInt();
            if (num < 0)
                sum_of_negative_num += num;
            else {
                if (num % 2 == 0)
                    sum_of_positive_even_num += num;
                else
                    sum_of_positive_odd_num += num;
            }
        }while(num != 0);

        System.out.println("Sum of negative num = "+sum_of_negative_num);
        System.out.println("Sum of positive_even_num = "+sum_of_positive_even_num);
        System.out.print("Sum of negative_odd_num = "+sum_of_positive_odd_num);

    }

}
