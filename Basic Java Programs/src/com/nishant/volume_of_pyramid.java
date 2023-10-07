//Volume of a pyramid with a triangular base

package com.nishant;

import java.util.Scanner;


public class volume_of_pyramid {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the triangular base: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        System.out.print("Enter the height of the prism: ");
        int height = sc.nextInt();

        //First we need to find the area of the triangle with heron's formula.

        double s = (double) (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        double volume = (double)1 /3 * area * height;
        System.out.print("Volume of prism: "+volume);

    }
}
