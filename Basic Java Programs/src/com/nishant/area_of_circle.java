// Area Of Circle Java Program.

package com.nishant;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        int radius = sc.nextInt();
        double area = 3.14 * Math.pow(radius,2);
        System.out.println("The area of the circle: "+area);
    }
}
