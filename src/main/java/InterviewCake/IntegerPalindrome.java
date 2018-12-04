package InterviewCake;

/**
 * Created by alekspribysh on 1/14/18.
 */
public class IntegerPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
    }


    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }


}
