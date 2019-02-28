public class Player {

    Board own;

    public Player() {
        this.own = new Board();
        own.placeShips();
        own.boatsSunk = 0;
        Board.status = "playing";
    }

    // this is where the user's guesses are collected and sent to the Board to analyze and update
    public String useGuess(int[] xAndY){
        String result = own.enterGuess(xAndY);
        if (own.boatsSunk == 4){
            Board.status = "player won";
        }
        if (result != "Oops! Something went wrong. Please try again." && Board.status == "playing"){
            return result + " Now your opponent is guessing...";
        } else {
            return "Oops! Something went wrong. Please try again.";
        }
    }

    public String cheater(){
        String result = own.testPlacement();
        return result;
    }

    // this just helps test some of the Board methods
    public String tester(int column){
        return own.displayBoard(column);
    }
}
