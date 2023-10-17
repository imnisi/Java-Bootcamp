//Java Program to print the largest element in an array


import java.util.Scanner;

public class largest_element_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len_arr = sc.nextInt();

        int[] num_arr = new int[len_arr];

        for(int i = 0; i < len_arr; i++){
            num_arr[i] = sc.nextInt();
        }
        System.out.print("Largest element of the array: "+largestElement(num_arr, len_arr));
    }

    static int largestElement(int[] numArr, int lenArr) {
        int largest_num = numArr[0];
        int i = 1;
        while(i < lenArr){
            if(largest_num < numArr[i]){
                   largest_num = numArr[i];
            }
            i++;
        }
        return largest_num;
    }
}
