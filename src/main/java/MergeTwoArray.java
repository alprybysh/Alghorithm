import javax.xml.soap.Node;

/**
 * Created by alekspribysh on 10/1/15.
 */
public class MergeTwoArray {
    public static void main(String[] args) {

        int [] ar1 = {1, 3, 5, 9, 10 };
        int [] ar2 = {2, 4, 6, 7, 8, 9, 12, 14};

        //merge(ar1, ar2);

        for (int item : merge(ar1, ar2)){
            System.out.print(item + " ");
        }



    }

    public static int[] merge(int [] arr1, int[] arr2){

      int [] arr = new int [arr1.length + arr2.length];
      int k =0, i = 0, j =0;
      while( k < arr.length){
          if ((i < arr1.length  && j < arr2.length && arr1[i]<= arr2[j])||(i < arr1.length  && j >= arr2.length)) {
              arr[k] = arr1[i];
              i++;
          }
          else {
              arr[k]= arr2[j];
              j++;
          }
          k++;
      }
        return arr;
    }
}
