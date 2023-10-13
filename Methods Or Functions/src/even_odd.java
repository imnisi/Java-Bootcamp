//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = even_odd_func(num);
        if(result == 0)
            System.out.print("It is an even number.");
        else
            System.out.print("It is an odd number.");

    }

    static int even_odd_func(int val) {
        if(val % 2 == 0)
            return 0;
        else
            return 1;
    }
}
