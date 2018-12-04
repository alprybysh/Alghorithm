package InterviewCake;

/**
 * Created by alekspribysh on 7/30/16.
 */
public class InterviewCakeClas {

    public static void main(String[] args) {
        int[] ar = {0, -4, -3, -2, -1};

        // mult(ar);
        //multGreed(ar);
        array(ar);

    }


    public static int[] mult(int[] ar) {
        int[] ar1 = new int[ar.length];


        for (int i = 0; i < ar.length; i++) {

            int temp = 1;

            for (int j = 0; j < ar.length; j++) {

                if (i != j) {

                    temp *= ar[j];
                }
            }

            ar1[i] = temp;

        }

        for (int a = 0; a < ar1.length; a++) {
            System.out.print(ar1[a] + " ");
        }

        return ar1;
    }


    public static int[] multGreed(int[] ar) {

        int[] beforeind = new int[ar.length];

        int sofar = 1;

        int[] after = new int[ar.length];


//        int [] resar = new int  [ar.length];


        for (int i = 0; i < ar.length; i++) {

            beforeind[i] = sofar;

            sofar *= ar[i];
        }

        System.out.println();

        for (int a = 0; a < beforeind.length; a++) {
            System.out.print(beforeind[a] + " ");
        }

        sofar = 1;
        for (int i = ar.length - 1; i >= 0; i--) {

            beforeind[i] *= sofar;

            sofar *= ar[i];


        }

        System.out.println();

        for (int a = 0; a < beforeind.length; a++) {
            System.out.print(beforeind[a] + " ");
        }

//        for (int i = 0; i < ar.length; i++){
//
//            resar[i] = beforeind[i] * after[i];
//        }
//
//
//        System.out.println();
//
//        for (int a = 0; a < resar.length; a++) {
//            System.out.print(resar[a] + " ");
//        }
//


        return null;
    }


    public static int array(int[] ar) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int res;

        for (int i = 0; i < ar.length; i++) {


            if (ar[i] > max1)
            {
                max3 = max2; max2 = max1; max1 = ar[i];
            }
            else if (ar[i] > max2)
            {
                max3 = max2; max2 = ar[i];
            }
            else if (ar[i] > max3)
            {
                max3 = ar[i];
            }

        }

        res = max1 * max2 * max3;

        System.out.println("max = " + max1 + " max2 = " + max2 + " max3 = " + max3 + " resul = " + res);


        return res;



    }
}


