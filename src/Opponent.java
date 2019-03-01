import java.util.Random;

public class Opponent {

    Board computer;

    public Opponent() {
        this.computer = new Board();
        computer.placeShips();
        computer.boatsSunkByUser = 0;
        Board.status = "playing";
    }

    // this is where the computer randomly guesses a location and sends that guess to the Board
    public String randomGuess() {
        Random random = new Random();
        int xRand = random.nextInt(8);
        int yRand = random.nextInt(8);
        int[] rowThenColumn = {xRand, yRand};
        String result = computer.enterGuess(rowThenColumn);
        if (result == "boat" && computer.boatsSunkByUser == 4) {
            return "Sorry, the computer has won.";
        } else if (result == "boat"){
            return "The computer has hit a boat. You have " + String.valueOf(computer.boatsSunkByUser - 1) + " left.";
        } else if (result == "miss") {
            return "The computer has missed. Now it is your turn.";
        } else {
            return "Oops! Something went wrong.";
        }
    }

    // this displays the board
    public void getBoard(){
        for (int a = 0; a < 8; a++){
            System.out.println(computer.displayBoard(a));
        }
    }

    public String listPlacement(){
        return computer.placement();
    }
}
