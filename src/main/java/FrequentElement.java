/**
 * Created by alekspribysh on 7/28/16.
 */
public class FrequentElement {

    public static void main(String[] args) {
        FrequentElement st = new FrequentElement();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 3,3,3,3};
       // System.out.println(st.counter(a));

        String str = "sabcabc";

        System.out.println(st.coun(str, "abc"));


    }


    public int counter(int[] ar) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {

            int tempFreq = ar[i];
            int temCount = 0;

            for (int j = i; j < ar.length; j++) {

                if (tempFreq == ar[j]) {
                    temCount++;
                }
            }

            if (temCount > count) {
                count = temCount;
            }


        }
        return count;
    }


    public int coun(String s, String key) {

        int k = 0;
        int l;

        //String[] ar = s.split("");

        for (int i = 0; i < s.length() - (key.length()-1); i++) {

            int j = i;
            l = key.length();
            String temp = "";

//                       while (l > 0) {
//                temp += ar[j];
//                j++;
//                l--;
//
//            }

            temp = s.substring(i, i + key.length());

            if (temp.equals(key)) {
                k++;
            }

        }

        return k;
    }
}
