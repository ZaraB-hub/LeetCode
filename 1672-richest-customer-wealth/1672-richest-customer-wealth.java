class Solution {
    public int maximumWealth(int[][] accounts) {
        
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        int result;
        
        for(int i=0;i<accounts.length;i++){
            result=0;
            for(int j=0;j<accounts[i].length;j++){
                result=result+accounts[i][j];
            }
            table.put(i,result);
        }
        
        int max=table.get(0);
        
        for(int i:table.values()){
            if(max<i)
                max=i;
        }        
        
        
        
        
        return max;
    }
}