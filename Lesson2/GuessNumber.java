import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isContinueGame;
    private int compNumber;
    private int number;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        compNumber = random.nextInt(101);
        System.out.println("compNumber = " + compNumber);
        isContinueGame = true;

        while (isContinueGame) {
            inputNumber(player1);
            inputNumber(player2);
            testNumber(player1);
            testNumber(player2);

            if (isContinueGame) {
                System.out.println("Никто не угадал, попробуйте ещё раз!");
            }
        }

    }

    public void testNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + ", вы угадали!");
            isContinueGame = false;
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        }
    }

    public void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        number = scan.nextInt();
        player.setNumber(number);        
    }
}