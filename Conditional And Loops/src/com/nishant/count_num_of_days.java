//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

package com.nishant;

public class count_num_of_days {
    public static void main(String[] args) {
        int day = 1;
        int count = 1;

       while(day <= 31){
           if(day % 2 == 0){
               count += 1;
           }
           day++;
       }
        System.out.print("No. of days Kunal can go out: "+count);
    }


}
