package InterviewCake;

/**
 * Created by alekspribysh on 1/6/18.
 */
public class fibonachi {


    public static void main(String[] args) {
        int i = 50;

        System.out.println(fib(i));
    }

    public static int fib (int x){
        if (x <= 0) return 0;
        if (x == 1){
            System.out.println(1);
            return 1;
        }
        int prev =fib(x / 2);
        int curr =prev *2;
        System.out.println(curr);
        return curr;



    }
}
