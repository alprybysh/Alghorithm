package com.Sortirovka;

/**
 * Created by alekspribysh on 11/22/15.
 */
public class Quicksort {
    public static void main(String[] args) {

        int [] array = {9, 2, 5, 6, 3};

        int low = 0;

        int high = array.length-1;
        sort(array, low, high);

        for (int a : array){
            System.out.print(a + " ");
        }

    }

    public static void sort(int[] arr, int low, int high){


        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }

        int i = low;
        int j = high;

        int middle = low + (high - low)/2;
        int pivot = arr[middle];



        while (i <= j){

            while (arr[i] < pivot){
                i++;

                System.out.println("i++++");
            }

            while (arr[j] > pivot){
                j--;

                System.out.println("j-----");
            }

            if (i <=  j ){

                swap(arr, i, j);
                System.out.println("swap");
                i++;
                j--;

            }

        }

        System.out.println("!!!!!");

        if (low < j)
            sort(arr, low, j);

        if (high > i)
            sort(arr, i, high);
    }

    public static void  swap(int[] arr, int i, int j ){

        int temp = arr [j];

        arr[j] = arr[i];

        arr [i] = temp;

    }


}
