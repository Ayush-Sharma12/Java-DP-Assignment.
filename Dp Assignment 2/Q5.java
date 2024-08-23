package DynamicProgramming;

import java.util.*;

public class Q5 {
           

           public static void main(String[] args) {
                     Scanner sc = new Scanner(System.in);

                    System.out.println("Enter the number of elements: ");
                    int size = sc.nextInt();
  
                    System.out.println("Enter amount: ");
                    int amount = sc.nextInt();

                     System.out.println("Enter Array Elements: ");
                       int[] nums = new int[size];
                        for(int i=0; i<nums.length; i++) {
                                nums[i] = sc.nextInt();
                        }
 

                        Solution s = new Solution();
                       int res =  s.change(amount, nums);

                       System.out.println("The number of Combination: " + res);
           }
}


class Solution {

          public int change(int amount, int[] coins) {
               
      
              int[][] dp = new int[coins.length][amount+1]; 
      
              for(int[] rows : dp) {
                   Arrays.fill(rows, -1);
              }
              return count(amount, coins, 0, dp);       
                 
           
      }
      
          int  count(int x, int[] coins, int idx, int[][] dp) {
      
                 
                  
      
                   if(idx == coins.length) return 0;
                   if(x == 0) { 
      
                         return 1;
                   }
                   
       
                  if(dp[idx][x] != -1) return dp[idx][x];
                   
                   
                   int notTake = count(x, coins, idx + 1, dp);
      
                   int take = 0;
                   if(coins[idx] <= x) take = count(x - coins[idx], coins, idx, dp);  
      
      
                   return dp[idx][x] = take + notTake;
      
                  
      
          }
      }