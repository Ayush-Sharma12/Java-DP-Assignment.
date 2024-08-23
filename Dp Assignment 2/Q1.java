package  DynamicProgramming;

import java.util.*;

public class Q1{

            public static void main(String[] args) {
                    
                      
                      int row = 3;
                      int col = 3;
                      int[][] obstacle = new int[row][col];
                      int[][] memo = new int[row][col]; // handle pverlapping subproblem

                      for(int[] rows : memo) {
                          Arrays.fill(rows, -1);
                      }

                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter Elements: ");

                      for(int i=0; i<obstacle.length; i++) {

                                for(int j = 0; j<obstacle[0].length; j++) {

                                           obstacle[i][j] = sc.nextInt();
                                }
                      }
                       
                      
                       if(obstacle[0][0] == 1)
                             System.out.println(0);

                      else{       
                        Solution s = new Solution();
                        int ans =  s.uniquePath(obstacle, memo, 0, 0, row, col);
                        System.out.println("The Number of Path: " + ans);
                      }

            }
}


class Solution {

             
            public int uniquePath(int[][] obstacle, int[][] memo,  int i, int j, int m, int n) {

                      
                     if(i == m || j == n) {
                          return 0;
                     }

                     if(i == m-1 && j == n-1) return 1;
                    
                     if(memo[i][j] != -1) return memo[i][j];
 
                     if(obstacle[i][j] == 1) return 0; // skip obstacle

                     int down = uniquePath(obstacle, memo,  i+1, j, m, n);
                     int right = uniquePath(obstacle,memo, i, j+1, m, n);

                     return memo[i][j] = down + right;

              }
                     
} 