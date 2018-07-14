import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        boolean game = true;       
        Scanner scan = new Scanner(System.in);
        String continueGame;
        System.out.print("Игрок 1, введите имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

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