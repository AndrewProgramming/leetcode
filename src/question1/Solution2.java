package question1;

/*我们可以用哈希表映射的方法，先把数组里所有元素的值作为key，下标作为value存进hashmap里，
        我们知道从hashmap里查找元素的时间复杂度近似常数，即O(1)。然后我们可以用一个for循环来遍历数组，
        遍历的过程中一边查找另一个数是否在hashMap里，例如a = nums[i]，然后查找b = targert - a是否在hashMap里，
        如果在，则证明a,b便是要找的数，否则继续查找。代码下：*/

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = {1, 2, 3, 456, 3};
        int[] r1 = solution.twoSum(a, 459);

        for (int i = 0; i < r1.length; i++) {
            System.out.println(r1[i]);
        }
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int r[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(i)) {
                r[0] = i;
                r[1] = map.get(n);
                break;
            }
        }

        return r;
    }
}
