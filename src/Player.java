public class Player {

    Board own;
    String status;

    public Player() {
        this.own = new Board();
        own.placeShips();
        this.status = "playing";
    }

    public String useGuess(int[] xAndY){

        return "Now your opponent is guessing..."; // this is a placeholder return, just so the program doesn't bug me
    }

    public Board getOwn() {
        return own;
    }

    public void changeOwn(int input) {
        // stuff about changing board, blah de blah blah
    }
}
