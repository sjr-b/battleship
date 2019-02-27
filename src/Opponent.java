import java.util.Random;

public class Opponent {

    Board computer;

    public Opponent() {
        this.computer = new Board();
        computer.placeShips();
        computer.boatsSunk = 0;
        Board.status = "playing";
    }

    public String randomGuess(){
        Random random = new Random();
        int xRand = random.nextInt(8);
        int yRand = random.nextInt(8);
        int[] rowThenColumn = {xRand, yRand};
        String result = computer.enterGuess(rowThenColumn);
        return result;
    }
}
