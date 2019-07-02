package question647;

public class PlayGround {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aabaa", 0, 1, 2));
        System.out.println("ss".substring(0,1));
    }

    public static boolean isPalindrome(String s, int start, int end, int length) {
        if (length == 1 || length == 0) return true;
        if (s.charAt(start) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s, start + 1, end - 1, length - 2);
    }
}
