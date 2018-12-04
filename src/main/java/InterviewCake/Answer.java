package InterviewCake;


import java.util.*;

/**
 * Created by alekspribysh on 11/21/16.
 */
public class Answer
{

    public static void main(String[] args)
    {
        //        Set A: (0, 5), (10, 12), (15, 22), (30, 33)
        //        Set B: (1, 2), (9, 11), (12, 14), (14, 15), (27, 35)
        //
        //        Result: (0,5), (9,11), (27, 35)

        // initialization
        List<int[]> listA = new ArrayList<int[]>();
        listA.add( new int[] { 0, 5 } );
        listA.add( new int[] { 10, 12 } );
        listA.add( new int[] { 15, 22 } );
        listA.add( new int[] { 30, 33 } );

        List<int[]> listB = new ArrayList<int[]>();
        listB.add( new int[] { 1, 2 } );
        listB.add( new int[] { 9, 11 } );
        listB.add( new int[] { 12, 14 } );
        listB.add( new int[] { 16, 17 } );
        listB.add( new int[] { 27, 35 } );

        //  === solution ===
        List<int[]> result = getIntersections( listA, listB );
        System.out.println(result);
    }

    public static List<int[]> getIntersections(List<int[]> listA, List<int[]> listB)
    {
        if ( listA.size() == 0 || listB.size() == 0 )
        {
            return new ArrayList<int[]>();
        }

        final Iterator<int[]> itA = listA.iterator();
        final Iterator<int[]> itB = listB.iterator();

        List<int[]> result = new ArrayList<int[]>();

        int[] a = itA.next();
        int[] b = itB.next();

        while ( itA.hasNext() || itB.hasNext() )
        {
            if ( onTheRight( a, b ) )
            {
                b = itB.next();
                continue;
            }
            if ( onTheLeft( a, b ) )
            {
                a = itA.next();
                continue;
            }
            result.add( b );
            b = itB.next();
        }

        // handle last element
        if ( !onTheRight( a, b ) && !onTheLeft( a, b ) )
        {
            result.add( b );
        }
        return result;
    }

    private static boolean onTheRight(int[] a, int[] b) {
        return a[0] > b[1];
    }

    private static boolean onTheLeft(int[] a, int[] b) {
        return a[1] < b[0];
    }

}
