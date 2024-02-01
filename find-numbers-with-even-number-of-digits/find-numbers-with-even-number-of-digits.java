class Solution {
    public int findNumbers(int[] nums) {
        
       int evenDigitNumbers = 0;
        
        for (int num : nums) {
            // Convert the number to a string and check its length
            if (String.valueOf(num).length() % 2 == 0) {
                evenDigitNumbers++;
            }
        }
        
        return evenDigitNumbers;
    }
}