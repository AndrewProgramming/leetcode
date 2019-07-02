package question217;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer item : nums) {
            set.add(item);
        }
        return !(set.size() == nums.length);
    }
}