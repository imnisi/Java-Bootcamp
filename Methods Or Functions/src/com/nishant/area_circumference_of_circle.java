package com.nishant;//Write a program to print the circumference and area of a circle of radius entered by user
// by defining your own method.

import java.util.Scanner;

public class area_circumference_of_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();

        double area = area_of_cir(radius);
        double circum = circum_of_circ(radius);

        System.out.println("Area of circle: "+area);


    }

    private static double circum_of_circ(int radius) {
        return 2 * 3.14 * radius;
    }

    private static double area_of_cir(int radius) {
         return 3.14 * Math.pow(radius,2);

    }
}
