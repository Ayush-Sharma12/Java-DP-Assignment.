package DynamicProgramming;

import java.util.*;

public class Q3 {
           
           public static void main(String[] args) {
                    
              Scanner sc = new Scanner(System.in);             
              System.out.println("Enter row: ");
              int row = sc.nextInt();
              
              System.out.println("Enter col: ");
              int col = sc.nextInt();
              
              
              int[][] grid = new int[row][col];
              int[][] memo = new int[row][col];

              for(int[] rows : memo) {

                      Arrays.fill(rows, -1);
              }



              Solution s = new Solution();
             int res =  s.getMinSum(grid, memo,  row, col, 0, 0);  
             System.out.println( "Minimum path sum: " + res); 
               
                 

           }



}
 /* 
class Solution{

          int getMinSum(int[][] grid, int[][] memo,  int m, int n, int i, int j){

          
                    if(i == m || j == n) return Integer.MAX_VALUE;
      
                    if(i == m-1 && j == n-1) {
                     
                      return grid[i][j];
                    }
                   
                    if(memo[i][j] != -1) return memo[i][j];
                    
                     
                    int right = getMinSum(grid, memo, m, n, i, j+1); 
                    int down =  getMinSum(grid,memo,  m, n, i+1, j);
      
                    return memo[i][j] = grid[i][j] + Math.min(right, down);
      
                   
      
          }
} */