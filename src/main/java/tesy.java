import InterviewCake.Integr;

import java.util.*;

/**
 * Created by alekspribysh on 1/27/18.
 */
public class tesy {

    public static void main(String[] args) {
        int[] ar = {1};
        int k = 0;
        int t = 1;

        System.out.println(containsNearbyDuplicate(ar));

    }

    public static int containsNearbyDuplicate(int[] nums) {

        if (nums.length == 0) return -1;

        int max = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != max && max < nums[i]*2){
                return -1;
            }
        }
        return index;
    }
}