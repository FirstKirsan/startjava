import java.util.Scanner;

public class Calc {
	String mathOperation;
    int numberOne;
    int numberTwo;

	public void start() {
		switch (mathOperation) {
			case "*": 
				System.out.println(numberOne * numberTwo);
				break;
			case "/":
				System.out.println(numberOne / numberTwo);
				break;
			case "+":
				System.out.println(numberOne + numberTwo);
				break;
			case "-":
				System.out.println(numberOne - numberTwo);
				break;
			case "%":
				System.out.println(numberOne % numberTwo);
				break;
			case "^":
				System.out.println(pow(numberOne, numberTwo));
				break;
			default: 
				System.out.println("Неизвестная операция");
		}
	}
	public int pow (int base, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		return result;
	}
}