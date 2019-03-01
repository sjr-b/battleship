public class Player {

    Board own;

    public Player() {
        this.own = new Board();
        own.placeShips();
        own.boatsSunkByUser = 0;
        Board.status = "playing";
    }

    // this is where the user's guesses are collected and sent to the Board to analyze and update
    public String useGuess(int[] xAndY){
        String result = own.enterGuess(xAndY);
        if (result == "boat" && own.boatsSunkByUser == 4){
            Board.status = "player won";
            return "Congratulations, you won!";
        } else if (result == "boat"){
            return "You sunk a ship! Now your opponent is guessing...";
        } else if (result == "miss"){
            return "You didn't hit any ships. Please wait while the computer guesses.";
        } else {
            return "Oops! Something went wrong. Please try again.";
        }
    }

    // this shows what the board is
    public void getBoard(){
        for (int a = 0; a < 8; a++){
            System.out.println(own.displayBoard(a));
        }
    }
}
