public class Player {

    Board own;

    public Player() {
        this.own = new Board();
        own.placeShips();
        own.boatsSunk = 0;
        Board.status = "playing";
    }

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

    public Board getOwn() {
        return own;
    }

    public void changeOwn(int input) {
        // stuff about changing board, blah de blah blah
    }

    public String tester(){
        return own.testPlacement();
    }
}
