//Java Program to left rotate the elements of an array perfoming n rotations.

import java.util.Arrays;
import java.util.Scanner;

public class left_rotation_of_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len_arr = sc.nextInt();

        int[] arr = new int[len_arr];

        for(int i = 0; i < len_arr; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotations: ");
        int n = sc.nextInt();
        System.out.print(Arrays.toString(leftRotation(arr, len_arr, n)));
    }

    static int[] leftRotation(int[] arr, int lenArr, int rotations) {
        while ( rotations > 0){
            int temp = arr[0];
            for (int i = 0; i < lenArr-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[lenArr - 1] = temp;
            rotations--;
        }
        return arr;
    }
}
