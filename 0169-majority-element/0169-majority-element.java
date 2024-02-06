class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        
     for(int num:nums){
         if(numbers.get(num)!=null){
             numbers.put(num,numbers.get(num)+1);
         }else
             numbers.put(num,1);
             
     }
    
    int k=0;
    for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
    if(entry.getValue()>nums.length/2){
        k=entry.getKey();
        break;
    }
}

        return k;
    }
}