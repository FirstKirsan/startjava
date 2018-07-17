import java.util.Scanner;

public class CalcTest {
	public static void main (String[] args) {
		boolean calc = true;
		String answer = "да";
		Scanner scan = new Scanner(System.in);
        String mathOperation;
        int numberOne;
        int numberTwo;
        Calc calcProgram = new Calc();

        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            numberOne = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            mathOperation = scan.next();
            System.out.print("Введите второе число: ");
            numberTwo = scan.nextInt();
            calcProgram.start(numberOne, mathOperation, numberTwo);
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }        
        System.out.println("The END");
	}
}