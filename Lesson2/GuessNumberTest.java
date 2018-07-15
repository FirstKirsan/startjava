import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        boolean isContinue = true;       
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.print("Игрок 1, введите имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2, введите имя: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        while (isContinue) {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
                //if (answer.equals("нет")) {
                //    isContinue = false;
                //    break;
                //}
            } while (!answer.equals("да") && !answer.equals("нет"));
            if (answer.equals("нет")) {
                isContinue = false;
            }
        }
        System.out.println("The END");
    }
}