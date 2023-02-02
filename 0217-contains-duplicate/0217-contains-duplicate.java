class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean repetition = false;
        HashMap<Integer, Integer> table = new HashMap<>();
        int occurance = 1;
        for (int i : nums) {
            if (table.containsKey(i)) {
                repetition = true;
                break;
            }
            table.put(i, occurance);
        }
        return repetition;
    }
}
