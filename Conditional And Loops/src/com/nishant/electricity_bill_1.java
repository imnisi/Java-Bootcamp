//Calculate electricity bill.
//The charges are as follows:
//        1 to 100 units: $10 per unit
//        100 to 200 units: $15 per unit
//        200 to 300 units: $20 per unit
//        Above 300 units: $25 per unit

package com.nishant;

import java.util.Scanner;

public class electricity_bill_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the electricity units: ");
        int units = sc.nextInt();
        int bill = 0;

        if(units >= 1 && units <= 100)
            bill = units * 10;
        else if(units >= 101 && units <= 200)
               bill = units * 15;
        else if(units >= 201 && units <= 300)
              bill = units * 20;
        else if(units >= 301)
            bill = units * 25;

        System.out.print("Electricity bill: "+bill);
    }


}
