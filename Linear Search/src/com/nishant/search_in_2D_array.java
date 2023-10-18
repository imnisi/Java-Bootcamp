package com.nishant;

import java.util.Arrays;

public class search_in_2D_array {
    public static void main(String[] args){
         int[][] arr = {{23, 4, 1},
                 {18, 12, 3, 9},
                 {78, 99, 34, 56},
                 {18,12}};
         int target = 99;
         int[] ans = searchIn2DArray(arr, target); //format of return value : {row}{col}
         System.out.print(Arrays.toString(ans));
    }
    static int[] searchIn2DArray(int[][] arr, int target){
        int[] ans = {-1, -1};
        if(arr.length == 0)
            return ans;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                       ans[0] = row;
                       ans[1] = col;
                       return ans;
                }

            }
        }
        return ans;
    }
}
