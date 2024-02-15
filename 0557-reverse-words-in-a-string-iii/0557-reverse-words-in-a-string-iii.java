class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int j = 0; j < arr.length; j++) {
            String word = arr[j];
            char[] chars = word.toCharArray();

            for (int i = 0; i < word.length() / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[word.length() - 1 - i];
                chars[word.length() - 1 - i] = temp;
            }

            reversed.append(new String(chars));
            if (j < arr.length - 1) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
