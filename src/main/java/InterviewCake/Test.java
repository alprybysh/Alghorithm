package InterviewCake;

public class Test {
    public static void main(String[] args) {

       int [] ar = {1,8,6,2,5,4,8,3,7};

       calculate(ar);


    }

    public  static int calculate (int[] height){

        if (height.length < 2) return 0;

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

    while (left < right){

        maxArea =  Math.max(maxArea, (right - left) * Math.min(height[right], height[left]));

        if (height[left] < height[right]) left++;
        else right --;
    }

        System.out.println(maxArea);
      return maxArea;
    }
}
