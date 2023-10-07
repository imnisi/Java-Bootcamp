//Calculate electricty bill
//For First 50 units: Rs 0.50/unit
//For next 100 units: Rs 0.75/unit
//For next 100 units: Rs 1.20/unit
//For unit above 250: Rs 1.50/unit
//An additional surcharge of 20% is added to the bill.

package com.nishant;

import java.util.Scanner;

public class electricity_bill_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the electricity units: ");
        int units = sc.nextInt();
        double bill = 0;

        if(units <= 50){
            bill = units * 0.50 * (double)20 / 100 * units;
        }
        else if(units <= 150){
            bill = 50 * 0.50 + (units - 50) * 0.75 + (double)20 / 100 * units ;
        } else if (units <= 250 ) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20 + (double)20 /100 * units;
        } else {
            bill = units * 1.50 + (double)20/100 * units;

        }
        System.out.print("Electricity bill: "+bill);
    }
}
