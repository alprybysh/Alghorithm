package InterviewCake;

/**
 * Created by alekspribysh on 8/21/16.
 */
public class Elochka {

    public static void main(String[] args) {

        int k = 15;

        elochkaSec(k);
    }


    public static void elochkaSec(int k) {

        int mid = k/2;
         for (int i = 0; i <= mid; i++){
             int midl = mid - i;
             int midr = mid + i;

             for (int j = 0; j < k; j++){

                 if (j == mid || j == midl){
                     while (midl <= midr){
                         System.out.print("*");
                         midl++;
                     }
                 }
                 else {
                     System.out.print(" ");
                 }

             }
             System.out.println();
         }

    }
}
