package com.nishant;

public class search_in_range {
    public static void main(String[] args){
        int[] arr = {4, 2, 7, -41, 11, 0, 45, -5, 22, 16, -3};
        int target = 45;
        int start = 1;
        int end = 9;
        boolean ans = searchInRange(arr, start, end, target);
        System.out.println(ans);
        System.out.print("Index is: "+searchInRange2(arr, start, end,target));
    }

   static boolean searchInRange(int[] arr, int start, int end, int target) {
        if(arr.length == 0)
            return false;
       for (int index = start; index <= end ; index++) {
           if(arr[index] == target)
               return true;
       }
       return false;
    }
    static int searchInRange2(int[] arr, int start, int end, int target) {
        if(arr.length == 0)
            return -1;
        for (int index = start; index <= end ; index++) {
            if(arr[index] == target)
                return index;
        }
        return -1;
    }

}
