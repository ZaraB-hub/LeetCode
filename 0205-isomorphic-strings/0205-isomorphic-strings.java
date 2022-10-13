
        class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char[] StoT = new char[256];
        
        char[] TtoS = new char[256];
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (StoT[c1] == 0 && TtoS[c2] == 0) {
                StoT[c1] = c2;
                TtoS[c2] = c1;
            }
            
            else if (!(StoT[c1] == c2 && TtoS[c2] == c1)) {
                return false;
            }
        }
        
        return true;
    }
}   
        
      