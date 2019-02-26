import java.util.Random;

public class Board {

    int[][] board;

    // 0 indicates an empty area, 1 indicates a boat

    public Board() {
        this.board = new int[8][8];
        for (int row = 0; row < 8; row++){
            for (int column = 0; column < 8; column++){
                this.board[row][column] = 0;
            }
        }
    }

    public void placeShips(){
        int [] placementX = new int[4];
        int [] placementY = new int[4];
        Random random = new Random();
        for (int a = 0; a < 4; a++){
            int xRand = random.nextInt(4);
            int yRand = random.nextInt(4);
            placementX[a] = xRand;
            placementY[a] = yRand;
        }
        for (int b = 0; b < 4; b++){
            for (int row = 0; row < 8; row++){
                for (int column = 0; column < 8; column++){
                    if (this.board[row][column] == b){
                        this.board[row][column] = 1;
                    }
                }
            }
        }
    }

    // is this needed?
//    public int[] randomize(){
//        Random random = new Random();
//        int xRand = random.nextInt(4);
//        int yRand = random.nextInt(4);
//        int[] rowThenColumn = {xRand, yRand};
//        return rowThenColumn;
//    }

}
