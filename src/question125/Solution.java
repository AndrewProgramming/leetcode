package question125;

class Solution {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() == 0) return true;

        s = s.toLowerCase().trim();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++ ;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}