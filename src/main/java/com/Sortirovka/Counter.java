package com.Sortirovka;

/**
 * Created by alekspribysh on 12/3/15.
 */
public class Counter {




    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 1, 5, 1, 2, 4, 2, 4};


        Counter counter = new Counter();

//        for (int i = 0; i < arr.length; i++){
//
//            arr[i] = (int) (Math.random() * 100);
//        }

        //counter.count(arr);
        counter.count1(arr);





    }

    public int[] count(int[] ar) {

        int[] ar1 = new int[100];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = 0;
        }

        int j = 0;
        int k;


        while (j >= 0 && j < ar.length ) {
            k = ar[j];
            ar1[k] = ar1[k] + 1;
            j++;
        }

//        for (int i = 0; i < 100; i++) {
//            System.out.print(ar1[i] + " ");
//        }

       for (int p = 0; p < ar1.length; p++){
           if (ar1[p] > 0){

               for (int s = 0; s < ar1[p]; s++){

                   System.out.println(p);

               }
           }

       }
        return ar1;

    }

    public int[] count1(int[] ar) {

        int[] ar1 = new int[100];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = 0;
        }

        int j = 0;
        int k;


        while (j >= 0 && j < ar.length ) {
            k = ar[j];
            ar1[k] = ar1[k] + 1;
            j++;
        }

        for (int t = 1; t < ar1.length; t++){

            ar1[t] = ar1[t-1] + ar1[t];
        }

        for (int a: ar1){
            System.out.print(a + " ");
        }



        return ar1;

    }

}
