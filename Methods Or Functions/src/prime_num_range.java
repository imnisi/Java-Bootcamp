//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class prime_num_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min and max ranges: ");
        int min_range = sc.nextInt();
        int max_range = sc.nextInt();

        prime_num(min_range, max_range);

    }

    static void prime_num(int min_range_val, int max_range_val) {

        while (min_range_val <= max_range_val) {
            int num = min_range_val;

            if (num < 2){
                min_range_val++;
                continue;
            }

            int i = 2;
            while (i * i < num) {
                if (num % i == 0) {
                    break;
                }
                i++;
            }
            if (i * i > num)
                System.out.print(num + ",");
            min_range_val++;
        }
    }
}

