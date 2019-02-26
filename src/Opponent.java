import java.util.Random;

public class Opponent {

    Board computer;
    String status;

    public Opponent() {
        this.computer = new Board();
        computer.placeShips();
        this.status = "playing";
    }

    public int[] randomGuess(){
        Random random = new Random();
        int xRand = random.nextInt(4);
        int yRand = random.nextInt(4);
        int[] rowThenColumn = {xRand, yRand};
        return rowThenColumn;
    }
}
