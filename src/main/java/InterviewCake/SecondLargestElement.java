package InterviewCake;
//
//import org.junit.internal.runners.statements.ExpectException;
//import org.testng.Assert;
//import org.testng.annotations.BinarySearchRotatedArray;

/**
 * Created by alekspribysh on 10/13/16.
 */
public class SecondLargestElement {



    public int findElem (int [] arr ) throws Exception{

        int firstLarge = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++){
            if (firstLarge < arr[i]){
                secLarge = firstLarge;
                firstLarge = arr[i];
            }
        }

        return secLarge;
    }

    int [] arr= {1,2,4,4,5,6,7,3,9 };
    int [] arr1 =  new  int[0];



}
