class Solution {
    public int maximumWealth(int[][] accounts) {
     
        int wealth=0;
        
        for(int[] customer:accounts){
            int customerWealth=0;
            for(int bank:customer){
                customerWealth+=bank; 
            }
            wealth=Math.max(wealth,customerWealth);
        }
     return wealth;
    }
}