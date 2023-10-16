//Leetcode problem: 1431 -- Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.Scanner;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] candies_arr = new int[len];

        for(int i = 0; i < len; i++){
            candies_arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();

        System.out.print(kidsWithCandies(candies_arr, extraCandies));
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max_candy = 0;
        for(int candy : candies){
            if(candy > max_candy){
                max_candy = candy;
            }
        }
        for(int candy : candies){
//            if(candy + extraCandies >= max_candy){
//                ans.add(true);
//            }else{
//                ans.add(false);
//            }
            //we can also do like that, because we should not use if - else with Boolean.
            ans.add(candy + extraCandies >= max_candy);

        }
        return ans;
    }

}
