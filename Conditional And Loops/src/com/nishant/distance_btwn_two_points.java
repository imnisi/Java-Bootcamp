// Calculate Distance Between Two Points.

package com.nishant;

import java.util.Scanner;

public class distance_btwn_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        int x_axis1 = sc.nextInt();
        int y_axis1 = sc.nextInt();
        System.out.print("Enter ending point: ");
        int x_axis2 = sc.nextInt();
        int y_axis2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow((x_axis2 - x_axis1),2) + Math.pow((y_axis2 - y_axis1),2));
        System.out.print("The distance between two points: "+distance);

    }

}
