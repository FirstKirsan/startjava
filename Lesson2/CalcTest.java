import java.util.Scanner;

public class CalcTest {
	public static void main (String[] args) {
		boolean calc = true;
		String continueCalc;
		Scanner scan = new Scanner(System.in);
        Calc calcProgram = new Calc();

        while (calc) {
            calcProgram.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                continueCalc = scan.nextLine();
                if (continueCalc.equals("нет")) {
                    calc = false;
                    break;
                }
            } while (!continueCalc.equals("да"));
        }
        System.out.println("The END");
	}
}