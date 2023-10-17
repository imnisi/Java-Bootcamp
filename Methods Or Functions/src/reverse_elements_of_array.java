//Java Program to print the elements of an array in reverse order

import java.util.Arrays;
import java.util.Scanner;

public class reverse_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for(int i = 0; i < len_arr; i++){
            num_arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(reverseElements(num_arr, len_arr)));
    }

    static int[] reverseElements(int[] numArr, int lenArr) {
        int[] revArr = new int[lenArr];
        for(int i = lenArr-1,j = 0; i >= 0; i--,j++){
            revArr[j] = numArr[i];
        }
        return revArr;
    }
}
