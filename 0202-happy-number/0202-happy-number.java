class Solution {
        public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int curr = n;
        while (!seen.contains(curr)) {
            seen.add(curr);
            int next = 0;
            while (curr > 0) {
                int digit = curr % 10;
                next += digit * digit;
                curr /= 10;
            }
            curr = next;
            if (curr == 1) {
                return true;
            }
        }
        return false;
    }
}