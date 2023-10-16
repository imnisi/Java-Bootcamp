//Leetcode Problem No:1920 -- Build Array from Permutation

import java.util.Arrays;
import java.util.Scanner;

public class Build_array_from_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for(int i  = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        while (i < nums.length) {
            ans[i] = nums[nums[i]];
            i++;
        }
        return ans;
    }


}
