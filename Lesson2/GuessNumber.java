import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1 = new Player("Vasya");
    Player player2 = new Player("Masha");

    public void game () {
        Random random = new Random();
        int compNumber = random.nextInt(100);
        System.out.println("compNumber = "+compNumber);
        int number;
        boolean continueGame = true;
        Scanner scan = new Scanner(System.in);

        while (continueGame) {
            System.out.print(player1.getName() + ", введите число: ");
            number = scan.nextInt();
            player1.setNumber(number);

            System.out.print(player2.getName() + ", введите число: ");
            number = scan.nextInt();
            player2.setNumber(number);

            if (player1.getNumber() == compNumber) {
                System.out.println(player1.getName() + " вы угадали!");
                continueGame = false;

            }

            if (player2.getNumber() == compNumber) {
                System.out.println(player2.getName() + " вы угадали!");
                continueGame = false;

            }

            if (continueGame) System.out.println("Никто не угадал, попробуйте ещё раз!");
        }

    }

}