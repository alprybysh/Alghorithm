package InterviewCake;

/**
 * Created by alekspribysh on 2/4/18.
 */
public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("\"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth\""));
    }

    public static String longestPalindrome(String s) {

        if (s.length() == 1){
            return s;
        }
        int maxLen = 0;
        int start =0;
        for (int i = 1; i < s.length(); i++ ){

            int low = i-1;
            int high = i;

            while (low >= 0 &&  high < s.length() && s.charAt(low) == s.charAt(high)){
                if (high-low +1 > maxLen){

                    start  = low;
                    maxLen = high-low +1;
                    System.out.println(start + " 1 start");
                    System.out.println(maxLen + " 1 len");

                }
                low--;
                high++;
            }
            low = i;
            high = i;
            while (low >= 0 &&  high < s.length() && s.charAt(low) == s.charAt(high)  ){

                if (high-low +1 > maxLen){

                    start  = low;
                    maxLen = high-low +1;
                    System.out.println(start + " 2 start");
                    System.out.println(maxLen + " 2 len");

                }

                low--;
                high++;
            }

        }

        int k = 0;

        return s.substring(start, start + maxLen +1);

    }
}
