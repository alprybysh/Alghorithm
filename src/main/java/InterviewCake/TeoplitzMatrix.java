package InterviewCake;

/**
 * Created by alekspribysh on 6/9/18.
 */
public class TeoplitzMatrix {

    public static void main(String[] args) {

       int [][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};

        System.out.println(check(matrix));

    }

    static public boolean check(int [][] matrix) {

        if (matrix.length == 0){return false;}

        for (int i = 0; i < matrix.length; ++i){
            for (int j = 0; j < matrix[0].length; ++j)
                if (i > 0 && j > 0 && matrix[i-1][j-1] != matrix[i][j])
                    return false;}
     return true;
    }
}
