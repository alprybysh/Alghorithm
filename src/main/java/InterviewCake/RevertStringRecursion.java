package InterviewCake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alekspribysh on 1/15/18.
 */
public class RevertStringRecursion {

    public static void main(String[] args) {
        String str = "privet";
        String str1 = "MDCCCLXXXIV";

//        System.out.println(rec(str));
//        System.out.println(1/10);

        System.out.println(romanToInt(str1));


    }

    public static int romanToInt(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int k = i + 1;

            char ch = s.charAt(i);

            int temp = value(ch);

            if (k < s.length()) {

                char ch1 = s.charAt(k);

                int temp1 = value(ch1);

                if (temp1 > temp) {
                    res += temp1 - temp;

                    i++;
                } else {
                    res += temp;

                }


            } else
            {
                res += temp;
            }


        }


        return res;
    }


    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }


    public static String rec(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        String x = str.substring(1) + str.charAt(0);
        return rec(str.substring(1)) + str.charAt(0);


    }


}
