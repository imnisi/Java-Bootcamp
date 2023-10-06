package com.nishant;

//Input currency in rupees and output in USD

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount (in rupees):");
        int amount = sc.nextInt();
        double converted_amount = amount * 0.012;
        System.out.println("Amount (in USD): "+"$"+converted_amount);

    }
}

