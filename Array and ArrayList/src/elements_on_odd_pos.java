//Java Program to print the elements of an array present in an
//odd position

import java.util.Scanner;

public class elements_on_odd_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        elementsOnOddPos(num_arr, len_arr);
    }

   static void elementsOnOddPos(int[] numArr, int lenArr) {
       if(lenArr == 0) {
           System.out.print("Empty array.");
       }else if(lenArr == 1){
           System.out.print(numArr[0]);
       }else {
           int pos;
           for (int i = 0; i < lenArr; i++) {
               pos = i + 1 ;
               if (pos % 2 != 0)
                   System.out.print(numArr[i] + " ");
           }
       }
   }
}
