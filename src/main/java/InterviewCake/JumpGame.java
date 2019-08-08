package InterviewCake;

public class JumpGame {

    public static void main(String[] args) {

        int [] ar = {3,2,1,2,0,4};
        System.out.println(canJump(2147483647, -2147483648));
    }

    public static  int canJump(int dividend, int divisor){


        int res = 0;

        int sign = 1;
     //   if (divisor == 1) return dividend;
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        System.out.println(dividend/divisor);

        sign = (dividend < 0 || divisor < 0) && (dividend > 0 || divisor > 0) ? sign * -1 : sign;

        dividend = dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : dividend;
        divisor = divisor == Integer.MIN_VALUE ? Integer.MAX_VALUE : divisor;

        divisor = divisor < 0 ? divisor * -1 : divisor;
        dividend = dividend < 0 ?  dividend * -1 : dividend;

        while(dividend >= divisor){
            dividend = dividend - divisor;
            res++;
        }


        return  res * sign;

    }

}
