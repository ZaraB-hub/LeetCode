import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Use a TreeSet to automatically remove duplicates and maintain sorted order
        TreeSet<Integer> set = new TreeSet<>();

        // Add all elements from nums to the set
        for (int num : nums) {
            set.add(num);

            // If the set size exceeds 3, remove the smallest element
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }

        // If there are less than 3 unique elements, return the maximum
        if (set.size() < 3) {
            return set.last();
        }

        // Otherwise, return the third maximum
        return set.first();
    }
}
