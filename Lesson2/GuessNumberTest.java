import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        boolean game = true;
        GuessNumber newGame = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        String gameYN;

        while (game) {
            newGame.game();
            boolean answer = true;
            while (answer) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                gameYN = scan.nextLine();
                if (gameYN.equals("да")) answer = false;
                if (gameYN.equals("нет")) {
                    answer = false;
                    game = false;
                }
            }

        }
        System.out.println("The END");
    }
}