//Take integer inputs till the user enters 0 and print the sum of all numbers

package com.nishant;

import java.util.Scanner;

public class sum_of_nums{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input, sum = 0;
        System.out.println("Enter 0 to see result:");

        do{
            input = sc.nextInt();
            sum += input;
        }while(input != 0);

        System.out.print("Result :"+sum);

    }
}
