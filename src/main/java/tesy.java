import InterviewCake.Integr;

import java.util.*;

/**
 * Created by alekspribysh on 1/27/18.
 */
public class tesy {

    public static void main(String[] args) {
        String st = "abcdefg";
        System.out.println(reverse(st));

    }

    public static String reverse (String st) {
        if(st.isEmpty()) return st;
        System.out.println(st.substring(1));
        System.out.println(st.charAt(0));
        return reverse(st.substring(1)) + st.charAt(0);
    }
}