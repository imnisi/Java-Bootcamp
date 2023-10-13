//LCM of two numbers

package com.nishant;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int LCM = num1 * num2 / HCF(num1, num2);
        System.out.print("LCM of two numbers is: " + LCM);

    }

    static int HCF(int num1, int num2) {
        int rem;
        while (num2 % num1 != 0) {
            rem = num2 % num1;
            num2 = num1;
            num1 = rem;
            }
            return num1;
        }
    }

