package com.Sortirovka;

/**
 * Created by alekspribysh on 11/22/15.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {9, 2, 5, 6, 3, 3, 8, 1, -8, 64, 14, 8, 1, 1, 0};

        sort1(array);
        for (int a : array) {
            System.out.print(a + " ");
        }


    }


    public static void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int smaller = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[smaller]) {
                    smaller = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[smaller];
            arr[smaller] = temp;

        }

    }

    public static void sort1(int[] arr) {


        for (int i = 0; i < arr.length; i++ ){
            int min = i;

            for (int j = i+1; j < arr.length; j++){

                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr [min] = arr[i];
            arr[i] = temp;

        }


    }
}
