//Leetcode problem: 1295 -- Find number with Even number of digits.

package com.nishant;

public class find_num_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896,0};
        int ans = findNumbers(nums);
        System.out.print(ans);
    }
    static int findNumbers(int[] nums){
        int ans = 0, count;
        for(int i = 0; i < nums.length; i++){

            //if number is 0, then it should be continued so that
            //it does not increase the value of ans variable.
            if(nums[i] == 0)
                continue;
            count = 0;

            //counting the number of digits
//            while(nums[i] > 0){
//                nums[i] = nums[i] / 10;
//                count++;
//            }
            count = (int)(Math.log10(nums[i])) + 1; //shortcut to find the number of digits.


            //checking the count is even or not
            if(count % 2 == 0)
                ans += 1;
        }
        return ans;
    }
}
