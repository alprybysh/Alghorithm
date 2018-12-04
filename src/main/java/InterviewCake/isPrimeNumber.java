package InterviewCake;

/**
 * Created by alekspribysh on 12/25/17.
 */
public class isPrimeNumber {


    public static void main(String[] args) {

        int[] ar = new int[100];

        for (int i = 0; i < 100; i++) {

            ar[i] = i;
        }

        printPrimeNumber(ar);
    }

    public static void printPrimeNumber(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 2) {
                i++;
            } else {
                boolean isPrime = true;

                int x = ar[i];
                for (int j = 2; j < x; j++) {
                    if (x % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(ar[i] + " ");
                }
            }
        }
    }
}
