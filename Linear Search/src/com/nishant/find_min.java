package com.nishant;

public class find_min {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.print("Minimum number: "+findMin(arr));
    }
    //assume arr.length != 0
    //return the minimum value of the array
    static int findMin(int[] arr) {
      int min_val = arr[0];
        for (int num:arr) {
            if(num < min_val)
                min_val = num;
        }
        return min_val;
    }
}
