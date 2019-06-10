package question9;

class Solution {
    public boolean isPalindrome(int x) {
        String target = String.valueOf(x);
        char[] targetArray = target.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = targetArray.length - 1; i >= 0; i--) {
            sb.append(targetArray[i]);
        }
        return sb.toString().equals(target);
    }
}