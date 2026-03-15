import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String doubled = s + s;

        for (int i = 0; i < n; i++) {
            String rotated = doubled.substring(i, i + n);
            System.out.println(longestPalindrome(rotated));
        }
    }

    static int longestPalindrome(String s) {
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, expand(s, i, i));
            max = Math.max(max, expand(s, i, i + 1));
        }
        return max;
    }

    static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() &&
               s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}