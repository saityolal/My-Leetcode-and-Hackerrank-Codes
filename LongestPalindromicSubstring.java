
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {

            String oneCenterPalindrome = expand(s, i, i);
            String twoCenterPalindrome = expand(s, i, i + 1);

            if (oneCenterPalindrome.length() > longest.length()) {
                longest = oneCenterPalindrome;
            }
            if (twoCenterPalindrome.length() > longest.length()) {
                longest = twoCenterPalindrome;
            }

        }
        return longest;
    }

    private static String expand(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}