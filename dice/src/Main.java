import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player = new Player("정재성");
        Board board = new Board(player);

        while (board.evaluate()) {
            board.prtBoard();
            sc.nextLine();
            System.out.println("Enter!\n");
            board.moveBoard();

        }
    }
}