import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> patt = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            if (!patt.containsKey(currentChar)) {
                if (patt.containsValue(words[i])) // Ensure one-to-one mapping
                    return false;
                patt.put(currentChar, words[i]);
            } else {
                if (!patt.get(currentChar).equals(words[i]))
                    return false;
            }
        }
        return true;
    }
}
