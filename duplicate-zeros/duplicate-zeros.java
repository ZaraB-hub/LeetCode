
        class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int lastIndex = length - 1;
        
        // Find the number of zeros to duplicate
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        
        // Iterate backwards and shift elements to the right
        for (int i = lastIndex; i >= 0; i--) {
            if (arr[i] == 0) {
                // If the current element is zero, duplicate it
                if (i + zeroCount <= lastIndex) {
                    arr[i + zeroCount] = 0;
                }
                zeroCount--;
                if (i + zeroCount <= lastIndex) {
                    arr[i + zeroCount] = 0;
                }
            } else {
                // If the current element is not zero, shift it
                if (i + zeroCount <= lastIndex) {
                    arr[i + zeroCount] = arr[i];
                }
            }
        }
    }
}