package InterviewCake;

/**
 * Created by alekspribysh on 2/4/18.
 */
public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        System.out.println(subPalindrome("\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\""));

    }

    public static String subPalindrome(String input) {
        String res = "";
        if (input.length() == 1) return input;
        if (input.isEmpty()) return res;

        for (int i = 0; i < input.length(); i++) {
            String temp = palindrome(input, i);
            res = res.length() < temp.length() ? temp : res;

        }
        return res;
    }

    public static String palindrome(String s, int index) {
        String res = s.substring(0, 1);

        int start = index - 1;
        int finish = index;
        while (start >= 0 && finish < s.length() && s.charAt(start) == s.charAt(finish)) {

            res = res.length() < s.substring(start, finish + 1).length() ? s.substring(start, finish + 1) : res;

            start--;
            finish++;
        }
        start = index - 1;
        finish = index + 1;

        while (start >= 0 && finish < s.length() && s.charAt(start) == s.charAt(finish)) {

            res = res.length() < s.substring(start, finish + 1).length() ? s.substring(start, finish + 1) : res;

            start--;
            finish++;

        }

        return res;
    }
}
