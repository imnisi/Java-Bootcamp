package com.nishant;

//Take input two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

import java.util.Scanner;

public class mini_calculator {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number:");
        int num2 = sc.nextInt();
        System.out.print("Enter any one operator:"+"\n"+"1.+\n"+"2.-\n"+"3.*\n"+"4./\n"+"5.%\n");
        char op = sc.next().charAt(0);
        int result = 0;
        if(op == '+')
            result = num1 + num2;

        else if(op == '-')
            result = num1 - num2;

        else if(op == '*')
            result = num1 * num2;

        else if(op == '/'){
            if(num2 != 0)
                result = num1/num2;
            else
                System.out.print("Can't divide by 0");

        }
        else if(op == '%'){
            if(num2 != 0)
                result = num1 % num2;
            else
                System.out.print("Can't divide by 0");
        }
        else System.out.print("Invalid input");
        System.out.print("Result : "+result);
    }
}
