import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1, player2;
    private boolean continueGame;
    private int compNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        compNumber = random.nextInt(101);
        System.out.println("compNumber = "+compNumber);
        int number;
        continueGame = true;
        Scanner scan = new Scanner(System.in);

        while (continueGame) {
            System.out.print(player1.getName() + ", введите число: ");
            number = scan.nextInt();
            player1.setNumber(number);

            System.out.print(player2.getName() + ", введите число: ");
            number = scan.nextInt();
            player2.setNumber(number);

            testNumber(player1);
            testNumber(player2);

            if (continueGame) {
                System.out.println("Никто не угадал, попробуйте ещё раз!");
            }
        }

    }

    public void testNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + " вы угадали!");
            continueGame = false;
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        }
    }
}