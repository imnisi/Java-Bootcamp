//Java Program to Find 3rd Largest Number in an array with distinct elements

import java.util.Arrays;
import java.util.Scanner;

public class third_largest_element_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        int third_largest_num = thirdLargestElement(num_arr, len_arr);
        if(third_largest_num == -1)
            System.out.print("Elements in array is less than 3.");
        else
            System.out.print("Third largest element of array: " + third_largest_num);
    }

    static int thirdLargestElement(int[] numArr, int lenArr) {
        if (lenArr < 3) {
            return -1;
        }

        //Approach 1: Using brute force approach to find nth largest number.
//        int max_num = 0;
//        int n = 2, j = 0;
//        while (n > 0) {
//            max_num = numArr[0];
//            for (int i = 0; i < lenArr; i++) {
//                if (max_num < numArr[i]) {
//                    max_num = numArr[i];
//                    j = i;
//                }
//
//            }
//           numArr[j] = 0;
//           n--;
//        }
//        return max_num;
//    }

        //Approach 2: Using sort method.

        Arrays.sort(numArr);
        return numArr[lenArr - 3];  //Returning the third-largest number of the array.
    }
}