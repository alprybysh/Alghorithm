package InterviewCake;

//import org.testng.Assert;
//import org.testng.annotations.BinarySearchRotatedArray;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alekspribysh on 10/29/16.
 */
public class Integr {


    public ArrayList<int[]> getOverlapIntervals(List<int[]> first, List<int[]> second) {

        ArrayList<int[]> result = new ArrayList<int[]>();

        if (first.size() == 0 || second.size() == 0) {
            return result;
        }

        int i = 0;
        int j = i;

        while (i < first.size() && j < second.size()) {

            int[] firstInterval = first.get(i);
            int[] secondInterval = second.get(j);

            if (isOverlap(first.get(i), second.get(j))) {

                result.add(first.get(i));

            }
            if (firstInterval[1] < secondInterval[0]) {
                i++;
            } else {
                j++;
            }

        }
        return result;
    }

    public boolean isOverlap(int[] first, int[] second) {
        if (second[0] < first[1] && second[1] > first[0]) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testOverlaps() {
        List<int[]> listA = new ArrayList<int[]>();
        listA.add(new int[]{0, 5});
        listA.add(new int[]{10, 12});
        listA.add(new int[]{15, 22});
        listA.add(new int[]{30, 33});

        List<int[]> listB = new ArrayList<int[]>();
        listB.add(new int[]{1, 2});
        listB.add(new int[]{9, 11});
        listB.add(new int[]{12, 14});
        listB.add(new int[]{14, 15});
        listB.add(new int[]{27, 35});

        List<int[]> expected = new ArrayList<int[]>();
        expected.add(new int[]{0, 5});
        expected.add(new int[]{9, 11});
        expected.add(new int[]{27, 35});

        ArrayList<int[]> result = getOverlapIntervals(listA, listB);
        Assert.assertEquals(result.size(), expected.size());
    }

//    @BinarySearchRotatedArray
//    public void testZeroSizeArray() {
//        List<int[]> listA = new ArrayList<int[]>();
//        listA.add(new int[] { 15, 16 });
//
//        List<int[]> listB = new ArrayList<int[]>();
//        listB.add( new int[] { 1, 2 } );
//        listB.add( new int[] { 9, 11 } );
//        listB.add( new int[] { 12, 14 } );
//
//        ArrayList<int []> result = getOverlapIntervals(listA, listB);
//        Assert.assertEquals(result.size(), 0);
//    }
//
//    @BinarySearchRotatedArray
//    public void testSomeArray() {
//        List<int[]> listA = new ArrayList<int[]>();
//        listA.add( new int[] { 5, 6 } );
//        listA.add( new int[] { 9, 10 } );
//
//        List<int[]> listB = new ArrayList<int[]>();
//        listB.add( new int[] { 9, 12 } );
//
//
//        ArrayList<int []> result = getOverlapIntervals(listA, listB);
//        Assert.assertEquals(result.size(), 0);
//    }
}







