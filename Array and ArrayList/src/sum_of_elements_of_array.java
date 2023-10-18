//Java Program to print the sum of all the items of the array

import java.util.Scanner;

public class sum_of_elements_of_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        System.out.println("Sum of elements: "+sumOfElements(num_arr));
    }

    private static int sumOfElements(int[] numArr) {
        int sum = 0;
        for (int num : numArr)
            sum += num;
        return sum;
    }
}
