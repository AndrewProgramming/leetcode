package question169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int r = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer item : nums) {
            if (map.containsKey(item)) {
                int counter = map.get(item);
                map.put(item, ++counter);

            } else {
                map.put(item, 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            int v = (int) entry.getValue();

            if (v > nums.length / 2) {
                r = (int) entry.getKey();
            }
        }

        return r;

    }
}