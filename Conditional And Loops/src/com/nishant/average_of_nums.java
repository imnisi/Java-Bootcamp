//Calculate Average Of N Numbers

package com.nishant;

import java.util.Scanner;

public class average_of_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int count = 0, sum = 0;

        while(true){
            int input = sc.nextInt();
            if (input == 0)
                System.out.print("Average of numbers: "+(double)sum / count);

            sum += input;
            count++;

        }
    }
}
