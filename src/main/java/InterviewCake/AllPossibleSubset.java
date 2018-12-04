package InterviewCake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alekspribysh on 6/11/18.
 */
public class AllPossibleSubset {

    public static void main(String[] args) {
        int [] nums = {1,2,3};

        for (List<Integer> list : sub(nums)){

            for (int item : list){
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }

    static List<List<Integer>> gRet;

    public static List<List<Integer>> sub(int [] nums){

        gRet = new ArrayList<>();
        for(int i = 0; i <= nums.length; i ++) {
            recurse(nums, i, 0, new ArrayList<>());
        }
        return gRet;
    }


    public static void recurse(int[] nums, int length, int s, List<Integer> acc) {

        if(acc.size() >= length) {
            gRet.add(acc);
            return;
        }

        for(int i = s; i < nums.length; i ++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.addAll(acc);
            tmp.add(nums[i]);
            recurse(nums, length, i + 1, tmp);
        }
    }
}
