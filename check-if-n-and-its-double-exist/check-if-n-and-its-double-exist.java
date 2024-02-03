class Solution {
    public boolean checkIfExist(int[] arr) {
        
        boolean t=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            
                 if (i != j && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
                    t = true;
                    break;
                }
            }
            if (t) break;
        }
        return t;
    }
}