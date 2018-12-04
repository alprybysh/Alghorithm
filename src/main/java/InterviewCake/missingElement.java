package InterviewCake;

/**
 * Created by alekspribysh on 8/6/16.
 */
public class missingElement {


    public static void main(String[] args) {
        int [] ar = {-1, 1, 2, 4, 8, 9,10};

        find(ar);
    }


    public static void find(int [] ar){

        int elem = ar[0];

        for (int i = 0; i < ar.length; i++ ){

            while ( ar[i] != elem){

                System.out.println(elem);
                elem +=1;
            }

            elem +=1;

        }


    }
}
