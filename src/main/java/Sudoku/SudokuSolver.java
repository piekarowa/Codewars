package Sudoku;

public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {8, 0, 6, 1, 5, 0, 0, 0, 0},
                {0, 0, 0, 8, 6, 0, 0, 0, 4},
                {0, 1, 0, 0, 0, 4, 5, 6, 8},
                {0, 0, 0, 0, 0, 0, 0, 5, 0},
                {0, 0, 5, 3, 0, 0, 6, 4, 0},
                {2, 0, 4, 5, 9, 7, 0, 8, 1},
                {0, 0, 0, 7, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 3, 0, 0, 7, 0},
                {4, 0, 0, 9, 0, 6, 0, 0, 0}
        };

    }

    private static boolean isNumberInRow(int[][] board, int number, int row){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][]board, int number, int row, int column){
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for(int i = localBoxRow; i < localBoxRow + 3; i++){
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column){
        return !isNumberInRow(board, number, row)&&
                !isNumberInColumn(board, number, column)&&
                !isNumberInBox(board, number, row, column);

    }

}
