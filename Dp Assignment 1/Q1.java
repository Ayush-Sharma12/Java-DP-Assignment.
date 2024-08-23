package DynamicProgramming.Assignment1;

public class Q1 {
          

           public static void main(String[] args) {
                       
                     int n = 5;
                     int m = 3;
                     
                    int res = countStairs(n, m);  

                    System.out.println("Number of Ways: " + res);
           }

           static int countStairs(int n, int m) {

                         int[] nums = new int[n+1];

                         nums[0] = 0;
                         nums[1] = 1;

                         for(int i=2; i<nums.length; i++) {
                                
                               nums[i] = nums[i-1] + nums[i-2];
                         }


                         return nums[n] + nums[m];
           }
}
