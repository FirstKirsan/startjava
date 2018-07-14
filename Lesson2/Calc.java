import java.util.Scanner;

public class Calc {
	private Scanner scanNumber = new Scanner(System.in);
	private Scanner scanOperation = new Scanner(System.in);
	private String mathOperation;
	private int numberOne;
	private int numberTwo;

	public void start() {
		System.out.print("Введите первое число: ");
		numberOne = scanNumber.nextInt();
		System.out.print("Введите знак математической операции: ");
		mathOperation = scanOperation.nextLine();
		System.out.print("Введите второе число: ");
		numberTwo = scanNumber.nextInt();
		switch (mathOperation) {
			case "*": {
				System.out.println(numberOne * numberTwo);
				break;
			}
			case "/": {
				System.out.println(numberOne / numberTwo);
				break;
			}
			case "+": {
				System.out.println(numberOne + numberTwo);
				break;
			}
			case "-": {
				System.out.println(numberOne - numberTwo);
				break;
			}
			case "%": {
				System.out.println(numberOne % numberTwo);
				break;
			}
			case "^": {
				int result = 1;
				for (int i = 0; i < numberTwo; i++) {
					result *= numberOne;
				}
			System.out.println(result);
			}
			default: {
				System.out.println("Unknown mathOperation");
			}
		}
	}
}