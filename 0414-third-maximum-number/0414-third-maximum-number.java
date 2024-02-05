class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        
//         int helper;
//         for(int i=0;i<nums.length/2;i++){
//             helper=nums[i];
//             nums[i]=nums[nums.length-i-1];
//             nums[nums.length-i-1]=helper;
//         }       
        
        //remove duplicates
        
    Set<Integer> set = new HashSet<Integer>();
    for (int num : nums) {
    set.add(num);
}
    int n = set.size(); 
    int arr[] = new int[n]; 
    
        int z = 0; 
        for (Integer x : set) 
            arr[z++] = x; 
        
 Arrays.sort(arr);

    int max=arr[0];    
    int max2=arr[0];
    int max3=arr[0];
     for(int na:arr){
         if (max<na){
             max3=max2;
             max2=max;
             max=na;
         }

     }
        if(arr.length<3)
            return max;
        else
            return max3;
    }
}
