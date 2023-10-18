//Java Program to right rotate the elements of an array

import java.util.Arrays;
import java.util.Scanner;

public class right_rotation_of_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for (int i = 0; i < len_arr; i++) {
            num_arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotations: ");
        int rotation = sc.nextInt();
        System.out.print(Arrays.toString(rightRotationOfElements(num_arr, len_arr, rotation)));
    }

     static int[] rightRotationOfElements(int[] numArr, int lenArr, int r) {
        //Ist Approach:

//         while (r > 0) {
//             int temp_var;
//             int var = numArr[0];
//             int temp = numArr[lenArr - 1];
//             for (int i = 0; i < lenArr - 1; i++) {
//                 temp_var = numArr[i + 1];
//                 numArr[i + 1] = var;
//                 var = temp_var;
//             }
//             numArr[0] = temp;
//             r--;
//         }
//         return numArr;
         //2nd approach:

         while(r > 0){
             int temp = numArr[lenArr - 1];
             for(int i = lenArr - 1; i > 0; i--){
                 numArr[i] = numArr[i - 1];
             }
             numArr[0] = temp;
             r--;
         }
         return numArr;
     }
}
