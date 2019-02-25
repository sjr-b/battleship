public class Board {

    int[][] board;

    public Board() {
        this.board = new int[8][8];
        for (int row = 0; row < 8; row++){
            for (int column = 0; column < 8; column++){
                this.board[row][column] = 0;
            }
        }
    }

    public void placeShips(){

    }

}
