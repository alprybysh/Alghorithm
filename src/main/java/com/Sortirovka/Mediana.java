package com.Sortirovka;

/**
 * Created by alekspribysh on 12/14/15.
 */
public class Mediana {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 6, 5, 3};

        int i = 0;
        int j = arr.length - 1;
        int p = arr[i];

        for (int f = 0; f < arr.length; f++) {

            while (arr[i] < p) {
                i++;
            }

            while (arr[j] > p) {
                j--;
            }

            if (j >= i) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

            for (int a : arr) {
                System.out.print(a + " ");
            }

        }
    }

}
