//Take integer inputs until the user enters 0 and print the largest number.

package com.nishant;

import java.util.Scanner;

public class largest_num_val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, max = 0;
        System.out.println("Enter 0 to see the largest number:");

        do{
            input = sc.nextInt();
            if(max < input)
                max = input;
        }while(input != 0);

        System.out.print("largest number: "+max);
    }
}
