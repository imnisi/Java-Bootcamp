package com.nishant;

import java.util.Arrays;

public class max_num_2D_array {public static void main(String[] args){
    int[][] arr = {{23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18,12}};
    int ans = maxNumIn2DArray(arr);
    System.out.print(ans);
}
    static int maxNumIn2DArray(int[][] arr){
     int max_num = Integer.MIN_VALUE;
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if(max_num < arr[row][col]){
                max_num = arr[row][col];
            }
        }
    }
    return max_num;
}
}
