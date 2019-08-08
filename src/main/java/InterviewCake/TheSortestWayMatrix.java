package InterviewCake;

public class TheSortestWayMatrix {

    public static void main(String[] args) {

      //  int [][] mat = {{1,3, 1}, {1 , 5, 1}, {4, 2, 1}};

        int [][] mat = {{1, 1, 1, 1, 1}, {2, 2 , 2, 4, 1}, {2, 2 , 2, 1, 1}, {2, 2, 2, 1, 5}, {2, 2, 2, 1, 1}};


        System.out.println(solution(mat));

    }

    public static int solution(int [] [] grid){

        int m = grid.length, n = grid[0].length;

        int soFar = 0;
        for(int i = 0; i < m; i++){

            for(int j = 0; j < n; j++){
                if(i == 0 && j != 0) {
                    grid[i][j] += grid[i][j-1];
                    soFar =  grid[i][j];
                }
;
                if(i != 0 && j == 0) {
                    grid[i][j] += grid[i-1][j];
                    soFar =  grid[i][j];
                }
                if (i != 0 && j != 0){
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                    soFar =  grid[i][j];
                }
            }
        }
        return grid[m-1][n-1];

    }
}
