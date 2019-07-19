/**
 * Created by alekspribysh on 9/17/15.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello world, how are you doing today?";
       // System.out.println(s);

      //  System.out.println(reverseSt(s));
      //  System.out.println(ReverseString1(s));
        System.out.println(ReverseStringinArray(s));
      //  System.out.println(reverse(s));

    }


    public static String reverseSt(String source){

        int j = source.length()-1;
        StringBuilder  res = new StringBuilder(source);
        for (int i = 0;  i <= j; i++){
            char first = source.charAt(i);
            char last = source.charAt(j);
            res.setCharAt(i, last);
            res.setCharAt(j, first);
            j--;
        }
        return res.toString();
    }


    public static char[] ReverseString1(String s) {

        char[] array;
        array = s.toCharArray();
        char temp;

        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;

            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
      //  System.out.println(array);

        return array;
    }

    public static String ReverseStringinArray(String s) {

        String [] ar = s.split(" ");
        for (int i = 0; i < ar.length/2; i++){
            String  temp = ar[ar.length-1-i];
            ar[ar.length-1-i] = ar[i];
            ar[i] = temp;
        }
        StringBuilder res = new StringBuilder();

        for (String st : ar){
            res.append(st + " ");
        }
        return res.toString().trim();
    }


    public static String reverse (String s){

        char [] arr = s.toCharArray();

        char [] fin = new char[arr.length];



        for (int i = 0; i < arr.length; i++){
            int j = arr.length -1-i;

            fin[j] = arr[i];
           // j--;

        }

        System.out.println(fin);



        char [] arr2 = new char[fin.length];
        int count;
        int count1 = 0;
        int count2 =0;
        char ch = ' ';
        for (int i = 0; i < fin.length; i++){
            count = i;

            if (fin[i] == ch || i == fin.length-1){

                while (count >= 0 && count >= count2){

                    arr2[count1++] = fin[count--];

                }
                count2 = count1;
            }

        }

        String s1 = new String(arr2);

        return s1;
    }


}
