package com.nishant;

public class linear_search {
    public static void main(String[] args) {
        int[] num_arr = {23, 45, 3, 67, -5, 0, 2, 11, -3, 99};
        int target = 2;
        int ans = linearSearch(num_arr, target);
        if(ans == -1)
            System.out.print("Element not found");
        else
            System.out.print(ans);

    }
    //search in the array: return the index if item found.
    //otherwise if item not found return -1.

    static int linearSearch(int[] numArr, int target){
        //check for empty array
        if(numArr.length == 0)
            return -1;
        //Searching for the target element
        for(int index = 0; index < numArr.length; index++){
            if(numArr[index] == target){
                return index;
            }
        }
        //if the target element is not found
        return -1;
    }
}
