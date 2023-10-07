//Curved Surface Area Of Cylinder

package com.nishant;

import java.util.Scanner;

public class csa_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        double curved_surface_area = 2 * 3.14 * radius * height;
        System.out.println("Curved Surface area of cylinder: "+curved_surface_area);
    }
}
