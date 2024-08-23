package DynamicProgramming.Assignment1;

import java.util.Arrays;

public class Q2 {


     public static int tribonacci(int n) {
        
          int[] dp = new int[n+1];
 
          Arrays.fill(dp, -1);
          return memo(n, dp);

    }

     static int memo(int n, int[] dp) {

           if(n == 1 || n==2) return 1;
           if(n == 0) return 0;

           if(dp[n] != -1) return dp[n]; 
           

          return dp[n] =  memo(n-1, dp) + memo(n-2, dp) + memo(n-3, dp);
    }
          
           
              public static void main(String[] args) {
                     
                     int n = 4;
                    System.out.println("Nth tribonacci: " + tribonacci(n));

             }
}
