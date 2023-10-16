//Java Program to find the frequency of each element in the
//array

import java.util.Arrays;
import java.util.Scanner;

public class frequency_of_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] arr = new int[len_arr];

        for(int i = 0; i < len_arr; i++){
            arr[i] = sc.nextInt();
        }
        frequencyElements(arr, len_arr);
    }

    static void frequencyElements(int[] brr, int lenBrr) {
        int[] temp = Arrays.copyOf(brr,lenBrr);
        for(int num : brr){
            int count = 0;
            int i = 0;
            while(i < lenBrr){
                if(num == temp[i]){
                    count++;
                    temp[i] = 0;
                }
                i++;
            }
            if(count != 0)
                System.out.println("Frequency of "+num+": "+count);
        }

    }
}
