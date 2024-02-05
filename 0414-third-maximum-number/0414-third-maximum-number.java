class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        
        //reverse order
        for(int i=0;i<nums.length/2;i++){
            int helper=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=helper;
        }       
        
       int elemCounted=1;
    int prevElem=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prevElem){
                elemCounted++;
                prevElem=nums[i];
            }
            
            if(elemCounted==3)
                return nums[i];
        }
        
        return nums[0];
    }
}
