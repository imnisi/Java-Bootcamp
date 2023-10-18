package com.nishant;//Define two methods to print the maximum and the minimum number respectively among three numbers
// entered by the user.

import java.util.Scanner;


public class max_and_min_nums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int min_num = min_func(num1,num2,num3);
        int max_num = max_func(num1,num2,num3);

        System.out.println("Minimum number: "+min_num);
        System.out.print("Maximum number: "+max_num);

    }

    static int max_func(int val1, int val2, int val3) {
        if(val1 > val2){
            return Math.max(val1, val3);
        }else {
            return Math.max(val2, val3);
        }
    }

    static int min_func(int val1, int val2, int val3) {
        int min = val1;
        if(val2 < min)
            min = val2;
        if(val3 < min)
            min = val3;
        return min;
    }


}
