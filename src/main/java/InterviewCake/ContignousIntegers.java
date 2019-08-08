package InterviewCake;

/**
 * Created by alekspribysh on 8/19/16.
 */
public class ContignousIntegers {


    public static void main(String[] args) {
        int[] ar = {-1, -2, -4, -4, -5, -8, -7, -15,};

        //System.out.println(sum(ar));
        System.out.println(sum1(ar));
    }


    public static int sum1(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumEnd = 0;

        for (int i = 0; i < a.length; i++){
            maxSumEnd = maxSumEnd + a[i];
            if (maxSum < maxSumEnd){
                maxSum = maxSumEnd;
            }

            if (maxSumEnd < 0){
                maxSumEnd = 0;
            }
        }

        return maxSum;
    }


}
