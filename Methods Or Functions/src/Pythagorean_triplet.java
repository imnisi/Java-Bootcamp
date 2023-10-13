//Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        if(is_pythagorean_triplet(d1,d2,d3))
            System.out.print("Pythagorean Triplet");
        else
            System.out.print("Not a Pythagorean Triplet");
    }

    static boolean is_pythagorean_triplet(int d1, int d2, int d3){
//        approach 1:
//        if((d1 * d1) + (d2 * d2) == (d3 * d3))
//            return true;
//        else if((d1 * d1) + (d3 * d3) == (d2 * d2))
//            return true;
//        else if ((d2 * d2) + (d3 * d3) == (d1 * d1))
//            return true;
//        else
//            return false;

        //approach 2:
        int max_val = Math.max(d1,Math.max(d2,d3));
        int other1, other2;

        if(max_val == d1){
            other1 = d2;
            other2 = d3;
        } else if (max_val == d2) {
            other1 = d1;
            other2 = d3;
        }else{
            other1 = d1;
            other2 = d2;
        }
     return max_val * max_val == other1 * other1 + other2 * other2;
    }
}
