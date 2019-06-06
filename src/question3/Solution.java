package question3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int maxLength = 1;
        Set<Character> set = new HashSet<>();

        char[] strArr = s.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            set.clear();
            set.add(strArr[i]);
            for (int j = i + 1; j < strArr.length; j++) {
                if (!set.contains(strArr[j])) {
                    set.add(strArr[j]);

                    if (set.size() > maxLength) {
                        maxLength = set.size();
                    }
                } else {
                    break;
                }
            }
        }

        return maxLength;
    }
}