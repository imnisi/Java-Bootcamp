//Java Program to Find 2nd Largest Number in an array with distinct elements.


import java.util.Arrays;
import java.util.Scanner;

public class second_largest_num_in_java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
               num_arr[i] = sc.nextInt();
        }
        int second_largest_num = secondLargestNum(num_arr, len_arr);
        if(second_largest_num == -1)
            System.out.print("Elements in array is less than 2.");
        else{
            System.out.print("Second largest number: "+second_largest_num);
        }
    }

    static int secondLargestNum(int[] numArr, int lenArr) {
        //Using sort method.
        if(lenArr < 2)
            return -1;
        Arrays.sort(numArr);
        return(numArr[lenArr - 2]);

    }
}
