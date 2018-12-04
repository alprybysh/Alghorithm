package com.Sortirovka;

import java.util.Scanner;

/**
 * Created by alekspribysh on 11/30/15.
 */
public class Insertion {

//    public static void insertIntoSorted(int[] ar) {
//        // Fill up this function
//
//        Scanner in = new Scanner(System.in);
//
//        int num = in.nextInt();
//        int size = in.nextInt();
//        int arr[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//
//            arr[i] = in.nextInt();
//        }
//
//        inser (arr);
//    }

    public static void main(String[] args) {
        int [] array =  { 2, 1, 3, 1, 2};

        insert1(array);
       // sum(array);

        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i] + " ");
        }
    }

    public static void insert (int [] arr  ){

        int x = 0;

        for(int i = 1; i < arr.length; i++){
            int value = arr[i];

            int j = i - 1;

            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j--;
                x++;
            }
            arr[j + 1] = value;
        }

        System.out.println(x);

    }








    public static void insert1 (int [] arr){

        for (int i = 0; i < arr.length; i++){
            int x = i;
            int j = i+1;

           while (x >= i){
                if(arr[x] > arr [j]){
                    int temp = arr [x];
                    arr[x] = arr [j];
                    arr[j] = temp;

                }
               x--;
               j--;
            }

        }


    }










}
