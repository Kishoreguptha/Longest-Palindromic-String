public class LongestPalindromeString {

    public static String intermediatePalindrome(String n, int left, int right) {

        if (left > right) return null;
        while (left >= 0 && right < n.length()
                && n.charAt(left) == n.charAt(right)) {
            left--;
            right++;
        }
        return n.substring(left + 1, right);
    }


    public static String longestPalindromeString(String n) {

        String longest = n.substring(0, 1);
        for (int i = 0; i < n.length() - 1; i++) {

            String palindrome = intermediatePalindrome(n, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }

            palindrome = intermediatePalindrome(n, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeString("aaaabaaa"));
        System.out.println(longestPalindromeString("abba"));
    }
}