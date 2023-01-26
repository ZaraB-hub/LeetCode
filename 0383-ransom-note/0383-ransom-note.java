class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> table = new HashMap<>();
        
      for (char ch: magazine.toCharArray()) {
          if ( table.containsKey(ch))
            table.put(ch,table.get(ch)+1);
          else
              table.put(ch,1);
        }
        
        for(char ch: ransomNote.toCharArray()){
            if (!table.containsKey(ch))
                return false;
            else if( table.containsKey(ch)){
                table.put(ch,table.get(ch)-1);
                if(table.get(ch)==-1)
                    return false;
            }
                
        }
        
        return true;
        
        
        
        
    }
}