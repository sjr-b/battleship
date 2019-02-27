import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Player player = new Player();
        Opponent computer = new Opponent();

        Scanner scan = new Scanner(System.in);
        System.out.println("A board has been created for you. You will now play against the computer.");
        System.out.println("Good luck.");
        System.out.println("Please begin to guess. Remember, your guesses have to be within the range [0,7]. 0 represents the first row/column, 1 represents the second, etc.");
        while (Board.status == "playing"){
            System.out.println("Please guess the row number.");
            int row = scan.nextInt();
            System.out.println("Please guess the column number.");
            int column = scan.nextInt();
            int[] guess = {row, column};
            String result = player.useGuess(guess);
            System.out.println(result);
        }
    }

}
