import java.util.Random;

public class Board {

    int[][] board;
    int boatsSunk;
    static String status = "";

    // 0 indicates an empty area, 1 indicates a boat, 2 indicates a sunken boat

    public Board() {
        this.board = new int[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                this.board[row][column] = 0;
            }
        }
    }

    public void placeShips() {
        int[] placementX = new int[4];
        int[] placementY = new int[4];
        Random random = new Random();
        for (int a = 0; a < 4; a++) {
            int xRand = random.nextInt(4);
            int yRand = random.nextInt(4);
            placementX[a] = xRand;
            placementY[a] = yRand;
        }
        for (int b = 0; b < 4; b++) {
            for (int row = 0; row < 8; row++) {
                for (int column = 0; column < 8; column++) {
                    if (row == placementX[b] && column == placementY[b]) {
                        this.board[row][column] = 1;
                    }
                }
            }
        }
    }

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

    public String testPlacement(){
        String result = "";
        for (int a = 0; a < 8; a++){
            for (int b = 0; b < 8; b++){
                if (this.board[a][b] == 1){
                    String row = String.valueOf(a);
                    String column = String.valueOf(b);
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
