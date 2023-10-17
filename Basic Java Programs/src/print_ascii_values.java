//How to Print ASCII Value in Java

import java.util.Scanner;

public class print_ascii_values {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.print("Ascii value of "+ch+": "+(int)ch);
    }
}
