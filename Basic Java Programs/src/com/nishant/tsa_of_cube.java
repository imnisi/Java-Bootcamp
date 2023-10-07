//Total surface area of cube.

package com.nishant;

import java.util.Scanner;

public class tsa_of_cube {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        int side = sc.nextInt();
        System.out.print("Total surface area of cube: "+(6 * Math.pow(side,2)));
    }
}
