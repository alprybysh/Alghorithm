package InterviewCake;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        int [][] mat = {{1, 1, 1, 1, 1, 1}, {1, 2, 2, 2, 2, 1}, {1, 2, 3, 3, 2, 1}, {1, 2, 2, 2, 2, 1}, {1, 1, 1, 1, 1, 1}};

        int num = 5;
        int matrix [][] = spiral(num);
        for (int i = 0; i <num; i++){
            for(int j =0; j < num; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int [] [] spiral(int num){
        int [][] matrix = new int[num][num];
        if (num == 0)  return matrix;
        if (num == 1){
            matrix[0][0] = num;
            return matrix;
        }
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        int cur = 1;

        while (cur <= num * num) {
            for (int c = c1; c <= c2; c++) {

                matrix[r1][c] = cur;
                cur++;
            }
            for (int r = r1 + 1; r <= r2; r++) {
                matrix[r][c2] = cur;
                cur++;
            }
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--){
                    matrix[r2][c] = cur;
                    cur++;
                }
                for (int r = r2; r > r1; r--) {
                    matrix[r][c1] = cur;
                    cur++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;

        }
        return matrix;


    }
}
