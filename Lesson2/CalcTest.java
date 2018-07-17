import java.util.Scanner;

public class CalcTest {
	public static void main (String[] args) {
		String answer = "да";
		Scanner scan = new Scanner(System.in);
        Calc calc = new Calc();

        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            calc.numberOne = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            calc.mathOperation = scan.next();
            System.out.print("Введите второе число: ");
            calc.numberTwo = scan.nextInt();
            calc.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }        
        System.out.println("The END");
	}
}