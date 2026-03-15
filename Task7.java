public class Solution {

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) return left;
                if (isPalindrome(s, left, right - 1)) return right;
                return -1;
            }
            left++;
            right--;
        }
        return -1;
    }

    // helper function
    public static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}