import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Игрок 1, введите имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);       
        String answer = "да";

        while (answer.equals("да")) {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("The END");
    }
}