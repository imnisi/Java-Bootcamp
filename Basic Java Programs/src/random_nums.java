// How to Generate Random Numbers in Java

import java.util.Scanner;

public class random_nums {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int random_num = (int) (Math.random() * 1000);
        System.out.print(random_num);
    }
}
