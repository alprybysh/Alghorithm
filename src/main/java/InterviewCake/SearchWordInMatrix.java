package InterviewCake;

/**
 * Created by alekspribysh on 6/9/18.
 */
public class SearchWordInMatrix {


    public static void main(String[] args) {
//        char[][] grid = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
//                {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
//                {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

        char[][] grid = {{'P', 'G', 'K', 'K', 'S', 'P'},
                {'E', 'E', 'S', 'T', 'S', 'Q'},
                {'K', 'O', 'E', 'O', 'T', 'P'},
                {'S', 'O', 'E', 'F', 'S', 'P'}};

        char[][] mat = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        System.out.println(exist(grid, "GEEK"));
        System.out.println();
        System.out.println(exist(grid, "GEEKSTSSF"));
        System.out.println();
        System.out.println(exist(mat, "ABCCED"));

    }


    static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;

    }

    private static boolean search(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }


        visited[i][j] = true;
        if (search(board, word, i - 1, j, index + 1) ||
                search(board, word, i + 1, j, index + 1) ||
                search(board, word, i, j - 1, index + 1) ||
                search(board, word, i, j + 1, index + 1)
        ) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }

}


