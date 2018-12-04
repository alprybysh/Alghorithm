/**
 * Created by alekspribysh on 11/30/15.
 */
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.seacrh1(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.seacrh1(arr1, 432));

    }

    public static void search(int [] arr, int low, int high,   int n){

        int middle = low + (high - low)/2;

        if (arr [middle] == n){

            System.out.println(arr[middle]);
            return;
        }

        if (arr[middle] > n){

            search(arr, low, middle, n );
        }

        if (arr[middle] < n){

            search(arr, middle + 1, arr.length-1, n );
        }

    }


    public static int seacrh1 (int [] arr, int key){

        int low = 0;

        int high = arr.length-1;


        while (low <=high){

            int mid = (low +high)/2;

            if (arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){

                low = mid +1;
            }
            else {
                high = mid -1;

            }
        }


       return -1;
    }

}
