class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
            return false;
        if(s.isEmpty())
            return true;
        
        char[]sArray=s.toCharArray();
        char[]tArray=t.toCharArray();
        
        int sub=0;
        
        for(int i=0;i<t.length() && sub<s.length();i++){
            if(sArray[sub]==tArray[i])
                sub++;
        }
        
   

        return s.length()==sub;
        
    }
    
}