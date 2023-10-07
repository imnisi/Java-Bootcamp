//Input a number and print all the factors of that number (use loops).

package com.nishant;

import java.util.Scanner;

public class factors_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
