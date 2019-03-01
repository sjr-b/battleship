import java.util.Random;

public class Board {

    int[][] board;
    int boatsSunkByUser;
    static String status = "";

    // 0 indicates an empty area, 1 indicates a boat, 2 indicates a sunken boat

    // this is the constructor
    public Board() {
        this.board = new int[8][8];
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                this.board[a][b] = 0;
            }
        }
    }

    // this places ships
    public void placeShips() {
        Random random = new Random();
        int boats = 4;
        while (0 < boats) {
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            if (this.board[x][y] != 1) {
                this.board[x][y] = 1;
                boats--;
            }
        }
    }

    // this is where the board is updates based on the row and column guesses
    public String enterGuess(int[] rowAndColumnGuess) {
        int row = rowAndColumnGuess[1];
        int column = rowAndColumnGuess[0];
        int test = this.board[row][column]; // KEEPING THIS HERE FOR NOW IN CASE YOU NEED IT FOR TESTING BUT REMOVE BEFORE TURNING IN!!!!
        if (this.board[row][column] == 1){
            this.board[row][column] = 2;
            this.boatsSunkByUser++;
            return "boat";
        } else {
            return "miss";
        }
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
    public String placement(){
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
        result = result.substring(0, result.length() - 5);
        return result;
    }

}