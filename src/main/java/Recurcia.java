/**
 * Created by alekspribysh on 9/3/15.
 */
public class Recurcia {



    public static void main(String[] args) {

        Recurcia rec = new Recurcia();
        int n = 5;
        rec.print(0);

        //int x = 1;
        // printAll(n);
        // System.out.println(printAll(n));
       // System.out.println(factorial(n));
       // System.out.println(febanachi(n, "Default"));
      //  System.out.println(stepen(n));

//        maxElem(0);
//        System.out.println( summ);

        //System.out.println(sum(n));
       // System.out.println(stepen1(n));


    }

    static int[] array =  {1, 2, 3, 4, 5};
    static int summ = 0;

    public static void   maxElem(int i){
        if(i == array.length){
            return;
        }

        summ = array[i] + summ;

        maxElem(i+1);

    }


    public static int sum (int n){
        if(n == 0){
            return 0;
        }
        //n = n + sum (n - 1);

        return sum(n-1)+n;
    }

    public static int stepen1 (int n){

        if(n == 0){
            return 1;
        }

        if(n == 1){
            return 2;
        }

        return stepen1(n-1)*2;
    }







    public static void printAll(int n) {

        if (n < 2) {
            System.out.println(n);
        } else {
            printAll(n - 1);

        }

    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        int res = factorial(n - 1)*n;
        return res;

    }

    public static boolean stepen(int n) {
        if (n % 2 == 1) {
            return false;

        } else {
            return true;
        }

    }

    public static int febanachi(int n, String s){
          //
        // \1 1 2 3 5 8 13 21 34 55 89
        System.out.println("with" +" " + new Integer(n).toString() + " call from " + s);

           if (n == 1 || n == 2) return 1;

            return febanachi(n-1, "f(n-1)") + febanachi(n-2, "f(n-2)");

    }

    public int print(int a){

        if (a == 1000){
            return 0;
        }


        System.out.println(print ( a + 1));

         return a;
    }



}
