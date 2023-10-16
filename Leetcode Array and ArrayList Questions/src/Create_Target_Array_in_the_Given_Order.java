//Leetcode Problem: 1389 -- Create Target Array in the Given Order

import java.util.Arrays;
import java.util.Scanner;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of first array: ");
        int num_len = sc.nextInt();
        int[] nums_arr = new int[num_len];

        for(int i = 0; i < num_len; i++){
            nums_arr[i] = sc.nextInt();
        }
        System.out.print("Enter the length of second array: ");
        int index_len = sc.nextInt();
        int[] index_arr = new int[index_len];

        for(int i = 0; i < index_len; i++){
            index_arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(createTargetArray(nums_arr, index_arr)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (target[i] == 0) {
                target[index[i]] = nums[i];
            } else {
                int temp = target[i];
                target[i] = target[i + 1];
                target[i + 1] = temp;
            }
        }
        return target;
    }
}
