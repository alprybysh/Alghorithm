package InterviewCake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alekspribysh on 7/31/16.
 */
public class Denomination {


    public static void main(String[] args) {

        int[] ar = {4, 3, 2};

        denominator(8, ar);

    }


    public static int denominator(int a, int[] ar) {
        int k = 0;

        HashMap <Integer, Integer>  map = new HashMap<Integer, Integer>();


        for (int i = 0; i < ar.length; i++) {

            int count = 0;
            int temp  = 0;

            while ( a > 1){

                temp = a;

                a /= ar[i];

                count++;

            }

            map.put(ar[i], count);
            a = temp;

        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("nominal " + key + " amount " + value);
        }


        return k;
    }

    public static int div(int a, int d) {
        return a /= d;
    }
}
