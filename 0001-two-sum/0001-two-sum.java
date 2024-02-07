class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int j;
        for(int i=0;i<nums.length-1;i++){
            j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target)
                    return new int[] {i, j};
                j++;
            }
            }
        return null;
        }
}