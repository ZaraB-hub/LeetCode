class Solution {
    public int[] runningSum(int[] nums) {
        
     int helper=nums[0];
        
      int[]result=new int[nums.length];
      result[0]=nums[0];
      
      for(int i=1;i<result.length;i++){
    
          result[i]=helper+nums[i];
          helper+=nums[i];
          
          // result[i] = result[i - 1] + nums[i];
      }
    

    
   return result;
        
        
        
        
        
        
        
        
        

    }
}