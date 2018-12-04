package InterviewCake;

/**
 * Created by alekspribysh on 1/16/16.
 */
public class Stock {

    public static void main(String[] args) {
        int[] ar = {10, 7, 5, 1, 1,1,1,1};
        Stock stock = new Stock();
        stock.maxANDmin(ar);

    }


    private void maxANDmin(int[] ar) {

        int maxPrice = ar[0];
        int minPrice = ar[0];
        int minIndex = 0;
        int maxIndex = 0;
        int prof = 0;
        int printMinIndex = 0;
        int printMaxIndex = 0;

        for (int i = 1; i < ar.length; i++){
            int temprof = 0;

            if (maxPrice < ar[i]){
                maxPrice = ar[i];
                maxIndex = i;
            }

            if (minPrice > ar[i]){
                minPrice = ar[i];
                maxPrice = 0;
                maxIndex = 0;
                minIndex = i;
            }

            if (minIndex < maxIndex){
                temprof = maxPrice - minPrice;
            }

            if (temprof > prof){
                prof = temprof;
                printMaxIndex = maxIndex;
                printMinIndex = minIndex;
            }


        }





        System.out.println(
                "prof = " + prof + " buy = " +  ar[printMinIndex] + " sell = " + ar[printMaxIndex]
        );
    }





}