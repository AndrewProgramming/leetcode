package question231;

class Solution {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & -n) == n;
    }
}