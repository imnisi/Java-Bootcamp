//Write a function that returns all prime numbers between two given numbers.

package com.nishant;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrimeNums {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the initial and final range: ");
        int initial_range = sc.nextInt();
        int final_range = sc.nextInt();
        System.out.print(allPrimes(initial_range, final_range));
    }

    static ArrayList<Integer> allPrimes(int initialRange, int finalRange) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = initialRange; i <= finalRange ; i++) {
            if(isPrime(i))
            {
                list.add(i);
            }
        }
       return list;
    }
    static boolean isPrime(int num){
        if(num == 0 || num == 1)
            return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }


}
