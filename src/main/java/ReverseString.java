/**
 * Created by alekspribysh on 9/17/15.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello world, how are doing today";
        System.out.println(s);
        //System.out.println(ReverseString1(s));
        //System.out.println(ReverseStringinArray(s));
        System.out.println(reverse(s));

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
        System.out.println(array);

        return array;
    }

    public static char[] ReverseStringinArray(String s) {
        char ch = ' ';
        char temp;
        char[] array = ReverseString1(s);
        int count = 0;
        int count1 =0;

        for (int i = 0; i < array.length; i++) {

            count++;
            if (array[i] == ch) {
                count = count - 1;
                int k = i - count;
                count = count / 2;

                for (int j = i - 1; count > 0; j--) {

                    temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                    count--;
                    k++;
                }
                count = 0;
            }

        }

        for (int i = array.length - 1; i > 0 ; i--) {

            if (array[i] == ch) {

                int k = array.length-1;
                count1 = count1 / 2;

                for (int j = i + 1; count1 > 0; j++) {
                    temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                    count1--;
                    k--;
                }
                break;

            }
            count1++;


        }



        return array;
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
