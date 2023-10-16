//Java Program to print the duplicate elements of an array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class duplicates_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(duplicatesElements(arr, len_arr));
    }

    static ArrayList<Integer> duplicatesElements(int[] arr, int lenArr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = Arrays.copyOf(arr,lenArr);
        for (int num : arr) {
            int count = 0;
            int i = 0;
            while (i < lenArr) {
                if (temp[i] == num ) {
                    count++;
                    temp[i] = 0;
                }
                i++;
            }
            if (count > 1) {
                list.add(num);
            }
        }
        return list;
    }
}

