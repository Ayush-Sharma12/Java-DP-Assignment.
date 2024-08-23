package DynamicProgramming.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
             

             public static void main(String[] args) {
                     
                        List<List<Integer>> triangle = new ArrayList<>();
                         int size = 4;
                        for(int i =0; i<size; i++) {
                                 
                                triangle.add(new ArrayList<>());
                         }

                         triangle.get(0).add(2);
                         triangle.get(1).add(3);
                         triangle.get(1).add(4);
                         triangle.get(2).add(6);
                         triangle.get(2).add(5);
                         triangle.get(2).add(7);
                         triangle.get(3).add(4);
                         triangle.get(3).add(1);
                         triangle.get(3).add(8);
                         triangle.get(3).add(3);


                 System.out.println("MinSum: " + minimumTotal(triangle));
 
             }

      public static int minimumTotal(List<List<Integer>> triangle) {
        


          int[][] memo = new int[triangle.size()][];
          for(int i=0; i<triangle.size(); i++){
                 
                memo[i] = new int[triangle.get(i).size()];
          } 

          for(int[] row : memo){
             
              Arrays.fill(row, -1);
          }

          

          return getMinPathSum(triangle, 0, 0, triangle.size(), memo);      
                    
    }
      
      static int getMinPathSum(List<List<Integer>> triangle, int i, int j, int size, int[][] memo){

               
                if(i == size - 1){
                      
                      return triangle.get(i).get(j);
                }
 
                if(memo[i][j] != -1) return memo[i][j];    

                int first = getMinPathSum(triangle, i+1, j, size, memo); // pick j index of second row.

                int second = getMinPathSum(triangle, i+1, j+1, size, memo); // pick j+1 index of second row.

                return memo[i][j] = triangle.get(i).get(j) + Math.min(first, second);
          
       }
}
