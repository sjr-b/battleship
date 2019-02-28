import java.util.Random;

public class Board {

    int[][] board;
    int boatsSunk;
    static String status = "";

    // 0 indicates an empty area, 1 indicates a boat, 2 indicates a sunken boat

    // this is the constructor
    public Board() {
        this.board = new int[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                this.board[row][column] = 0;
            }
        }
    }

    // this places ships
    public void placeShips() {
        Random random = new Random();
        int [] xCheck = {-1, -1, -1, -1};
        int [] yCheck = {-1, -1, -1, -1};
        for (int a = 0; a < 4; a++){
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            if (x == xCheck[0] && y == xCheck[0] || x == xCheck[1] && y == xCheck[1] || x == xCheck[2] && y == xCheck[2] || x == xCheck[3] && y == xCheck[3]){
                a--;
            } else {
                this.board[x][y] = 1;
                int test = this.board[x][y];
            }
        }

//        int[] placementX = new int[4];
//        int[] placementY = new int[4];
//        Random random = new Random();
//        for (int a = 0; a < 4; a++) {
//            int xRand = random.nextInt(8);
//            int yRand = random.nextInt(8);
//            placementX[a] = xRand;
//            placementY[a] = yRand;
//        }
//        for (int b = 0; b < 4; b++) {
//            for (int row = 0; row < 8; row++) {
//                for (int column = 0; column < 8; column++) {
//                    if (row == placementX[b] && column == placementY[b]) {
//                        this.board[row][column] = 1;
//                    }
//                }
//            }
//        }
    }

    // this is where the board is updates based on the row and column guesses
    public String enterGuess(int[] rowAndColumnGuess) {
        int rowGuess = rowAndColumnGuess[0];
        int columnGuess = rowAndColumnGuess[1];
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++){
                if (a == rowGuess && b == columnGuess && this.board[a][b] == 1){
                    this.board[a][b] = 2;
                    this.boatsSunk++;
                    return "You sunk a boat!";
                } else if (a == rowGuess && b == columnGuess){
                    return "You missed!";
                }
            }
        }
        return "Oops! Something went wrong. Please try again.";
    }

    // this displays the board
    public String displayBoard(int columnNumber){
        String row = "";
        for (int a = 0; a < 8; a++){
            String locationStatus = String.valueOf(this.board[columnNumber][a]);
            row += locationStatus + " ";
        }
        return row;
    }

    // this is just to test that the boats are all being updated and bce
    public String testPlacement(){
        String result = "";
        for (int a = 0; a < 8; a++){
            for (int b = 0; b < 8; b++){
                if (this.board[a][b] == 1){
                    String row = String.valueOf(b);
                    String column = String.valueOf(a);
                    result += "Row: " + row + " Column: " + column + "  ||  ";
                }
            }
        }
        return result;
    }

}
    // is this needed? prob not, but we'll see
//    public int[] randomize(){
//        Random random = new Random();
//        int xRand = random.nextInt(4);
//        int yRand = random.nextInt(4);
//        int[] rowThenColumn = {xRand, yRand};
//        return rowThenColumn;
//    }
