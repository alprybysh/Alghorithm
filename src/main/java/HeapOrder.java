/**
 * Created by alekspribysh on 1/11/16.
 */
public class HeapOrder {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 4, 6, 12, 8};
       // System.out.println(isHeapOrdered(a));
        System.out.println(isMin(a));
    }

    public static boolean isHeapOrdered(int[] a) {


        for (int i = 0; i < a.length; i++) {

            if (a[i] < a [2 *i] && a[i] < a [2 *i+1]) {

                return true;
            }
            else {return false;}

        }
        return true;
    }

    public static boolean isMin(int [] a){

        boolean val = false;

        int middle = a.length/2;

        for (int j = 0; j < middle; j++){
            int childA = j * 2;
            int childB = j * 2 + 1;
            System.out.println(a[childA]);
            System.out.println(a[childB]);

            if(a[j] <= a[childA] && a[j]<=a[childB]){

               val = true;

            }
            else {
                return false;
            }
        }

        return val;
    }


}

