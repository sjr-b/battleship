import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        System.out.println("Hello, and welcome to battleship!");
        Player player = new Player();
        Opponent computer = new Opponent();
        System.out.println("");
        System.out.println("Here is your board.");
        System.out.println("");
        System.out.println(computer.listPlacement());
        computer.getBoard();
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Good luck! You may start guessing.");
        System.out.println("Remember, your guesses have to be within the range [0,7]. 0 represents the first row/column, 1 represents the second, etc.");
        System.out.println("");
        while (Board.status == "playing"){
            System.out.println("Please guess the row number.");
            int row = scan.nextInt();
            System.out.println("Please guess the column number.");
            int column = scan.nextInt();
            int[] guess = {row, column};
            String result = player.useGuess(guess);
            System.out.println(result);
            computer.getBoard();
            Board.status = "end";
        }
    }

}
