import javax.xml.soap.Node;

/**
 * Created by alekspribysh on 10/1/15.
 */
public class MergeTwoArray {
    public static void main(String[] args) {

        int [] ar1 = {1, 3, 5, 9, 10, 11};
        int [] ar2 = {2, 4, 6, 7, 8, 9, 12, 14};

        merge(ar1, ar2);
        System.out.println();

    }

    public static int[] merge(int [] arr1, int[] arr2){

      int [] arr = new int [arr1.length + arr2.length];
        int len = arr1.length > arr2.length ? arr2.length:arr1.length;
        int i= 0, j = 0, k=0, z =0;
        while (z < len){
            while (arr1[i] <= arr2[j]){
                arr[k]= arr1[i] ;
                i++;
                k++;
                z++;
            }
            while (arr2[j] <= arr1[i]){
                arr[k]= arr2[j] ;
                j++;
                k++;
                z++;
            }

        }

        if(i < arr1.length){
            while(i < arr1.length) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
        }
        if(j < arr2.length){
            while(j < arr2.length){
                arr[k] = arr2[j];
                j++;
                k++;

            }
        }

        for (int f =0; f < arr.length; f++ ){
            System.out.print(arr[f] + " ");
        }

        return arr;
    }

}
