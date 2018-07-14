import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        boolean game = true;
        Player player1 = new Player("Vasya");
        Player player2 = new Player("Masha");
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        Scanner scan = new Scanner(System.in);
        String continueGame;

        while (game) {
            guessNumber.start();
            boolean answer = true;
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                continueGame = scan.nextLine();
                if (continueGame.equals("нет")) {
                    game = false;
                    break;
                }
            } while (!continueGame.equals("да"));
        }
        System.out.println("The END");
    }
}