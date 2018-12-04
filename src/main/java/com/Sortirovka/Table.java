package com.Sortirovka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by alekspribysh on 12/14/15.
 */
public class Table {

    public static void main(String[] args) throws IOException {

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();


        int i = 0;
        String[] strarr = {"Guzel", "Ira",
                "Natasha", "Alex", "Katya", "Lena", "Sasha", "Max", "Sasha P", "Nastya"};

        while (i < strarr.length) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter score for " + strarr[i] + " ");
            int k = 0;
            try {
                 k = Integer.parseInt(br.readLine());
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid Format!");
            }
            map.put( strarr[i], k);
            i++;

        }

        System.out.println();
        sortByValues(map);

        int j = 1;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            System.out.println("Place: " + j + " " + key + " " + value );
            j++;
        }


    }

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };

        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }


}
