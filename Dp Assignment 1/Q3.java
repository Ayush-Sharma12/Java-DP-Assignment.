package DynamicProgramming.Assignment1;

public class Q3 {
          
            

             public static void main(String[] args) {
                    int[] nums = {1, 2, 3, 1};

                    int res = rob(nums);
                    System.out.println("Total robbery: " + res);
                       
             } 

             public  static int rob(int[] nums) {
          
                    if(nums.length < 2) return nums[0]; // if the len 1 simply return the it. 
                      
           
                      nums[1] = Math.max(nums[0], nums[1]);
                      
                      for(int i=2; i<nums.length; i++) {
                              
                           nums[i] = Math.max(nums[i-2] + nums[i], nums[i-1]);   
                           
                      }
           
           
                   return nums[nums.length-1];
                       
               }
}
