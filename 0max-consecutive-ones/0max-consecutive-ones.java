class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int most1=0;
        int most2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                most1++;
            } else{
                most2 = Math.max(most1, most2);
                most1 = 0;
            }
            
        }
        
        if(most1==0 || most1<most2){
            return most2;
        }else 
        return most1;
        
        
    }
}