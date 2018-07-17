import java.util.Scanner;

public class Calc {
	private Scanner scan = new Scanner(System.in);

	public void start(int numberOne, String mathOperation, int numberTwo) {
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
				System.out.println(doDegree(numberOne, numberTwo));
				break;
			default: System.out.println("Unknown mathOperation");
		}
	}
	public int doDegree (int numberOne, int numberTwo) {
		int result =1;
		for (int i = 0; i < numberTwo; i++) {
			result *= numberOne;
		}
		return result;
	}
}