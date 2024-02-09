class Solution {
    public int searchInsert(int[] nums, int target) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
            
            
        }
        
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i])
                max=nums[i];
        }
        
        if(target>max)
            return nums.length;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target)
                continue;
            else
                return i;
        }
        
        return 0;
    }
}