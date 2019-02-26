import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Board player = new Board();
        player.placeShips();
        Board computer = new Board();
        computer.placeShips();

        Scanner scan = new Scanner(System.in);
        System.out.println("A board has been created for you. You will now play against the computer.");
        System.out.println("Good luck.");
        System.out.println("Please begin to guess. This first guess will be the row number. There are eight rows, so please guess any numbers between 0 and 7.");
        int row = scan.nextInt();
    }

}
