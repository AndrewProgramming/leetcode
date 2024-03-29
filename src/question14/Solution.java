package question14;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // 找出S1与Si间的最长公共字符串
            // indexOf：当存在串时返回>0；不存串时返回-1
            // 只要不存在串，就缩减串的规模，再进行查找
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        longestCommonPrefix(s);
    }
}