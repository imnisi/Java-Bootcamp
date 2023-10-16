//Java Program to copy all elements of one array into another
//array

import java.util.Arrays;
import java.util.Scanner;

public class copying_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(Arrays.toString(copyingElements(arr, len)));
    }

    static int[] copyingElements(int[] arr, int len) {
        int[] copy_arr = new int[len];
        int i  = 0;
        for(int num : arr){
            copy_arr[i] = num;
            i++;
        }
        return copy_arr;
    }
}
