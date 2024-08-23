package DynamicProgramming;

import java.util.*;

public class Q4 {
       
            public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Enter the number of elements: ");
                    int size = sc.nextInt();
 
                     System.out.println("Enter Array Elements: ");
                       int[] nums = new int[size];
                        for(int i=0; i<nums.length; i++) {
                                nums[i] = sc.nextInt();
                        }


                      Solution s = new Solution();
                       
                      if(s.canPartition(nums)) {
                              System.out.println("True");
                      }  else{
                              System.out.println("False");
                      }
                       
                    
            }


}

/* 
 class Solution {
                    public boolean canPartition(int[] nums) {
                        
                           int sum = 0;
                           int n = nums.length;
                           for(int i=0; i<n; i++) {
                                      
                                   sum += nums[i];   
                               
                           }
                
                           if(sum % 2 != 0) return false;
                
                           int target = sum / 2;
                           
                           int[][] memo = new int[n][target+1]; 
                
                           for(int[] row: memo) {
                              Arrays.fill(row, -1);
                           } 
                
                            return isEqual(nums, n-1, target, memo);
                
                
                    }
                
                
                    boolean isEqual(int[] nums, int idx, int x, int[][] memo) {
                
                              
                              if(x == 0) {
                
                                    return true;
                              }
                            
                              if(x > 0 && idx == 0) 
                                  return nums[idx] == x;
                
                              if(idx == 0) return false; 
                
                              if(memo[idx][x] != -1) { 
                                    if(memo[idx][x] == 1) return true;
                                    else return false;
                              }
                             boolean take = false;
                             boolean notTake = isEqual(nums, idx - 1, x, memo);
                
                             if(nums[idx] <= x) take = isEqual(nums, idx-1, x - nums[idx], memo); 
                
                             boolean res =  take || notTake;     
                
                             if(res) memo[idx][x] = 1;
                             else memo[idx][x] = 0;
                
                             return res;    
                
                
                    }
                }
*/