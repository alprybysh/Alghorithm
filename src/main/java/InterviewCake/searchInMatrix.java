package InterviewCake;

/**
 * Created by alekspribysh on 6/9/18.
 */
public class searchInMatrix {


    public static void main(String[] args) {

        int [][] matrix = {{1, 4, 7, 11, 15}, {2, 5,  8, 12, 19}, {3,   6,  9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target  =89;

        search(matrix, target);


    }

     public static boolean  search(int [] [] matrix, int target ){

        if (matrix.length == 0){return false;}

        for (int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == target) return true;
                if (matrix[i][j] > target) break;
            }
            System.out.println();
        }
      return false;
    }
}
