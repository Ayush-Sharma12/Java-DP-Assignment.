package DynamicProgramming;

import java.util.Scanner;

public class Q2 {
         
            public static void main(String[] args) {
                   
                   
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number of elments: ");
                    
                      int size = sc.nextInt();
                      int[] nums = new int[size]; 

                      System.out.println("Enter" + size + " Elements: ");

                      for(int i=0; i<nums.length; i++) {

                                nums[i] = sc.nextInt();
                      }



                      Solution s = new Solution();
                     int res = s.houseRobber2(nums, size);

                     System.out.println("Maximum Robbery: " + res);

                      
            }
}

/* 
class Solution {

               
      public int houseRobber2(int[] nums, int size) {
 
         
          int[] first = new int[size]; // skip First house 
          
          first[1] = nums[1];
          first[2] = Math.max(first[1], nums[2]);

          for(int i = 3; i<first.length; i++) {

                 first[i] = Math.max(first[i-1], nums[i] + first[i-2]);      
          }
          

          int[] last = new int[size - 1]; // skip last house
          last[0] = nums[0];
          last[1] = Math.max(last[0], nums[1]);
             

          for(int i=2; i<last.length; i++) {

                 last[i] = Math.max(last[i-1], nums[i] + last[i-2]);     
          }
         
         
          return Math.max(last[last.length-1], first[first.length-1]);
      }           
} */