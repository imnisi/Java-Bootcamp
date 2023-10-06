package com.nishant;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greet_msg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Good Afternoon "+name);
    }
}
