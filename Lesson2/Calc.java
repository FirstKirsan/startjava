import java.util.Scanner;

public class Calc {
	private char mathOperation;
    private int numberOne;
    private int numberTwo;

    public void setMathOperation(char mathOperation) {
    	this.mathOperation = mathOperation;
    }
    public void setNumberOne(int numberOne) {
    	this.numberOne = numberOne;
    }
    public void setNumberTwo(int numberTwo) {
    	this.numberTwo = numberTwo;
    }

	public void start() {
		switch (mathOperation) {
			case '*': 
				System.out.println(numberOne * numberTwo);
				break;
			case '/':
				System.out.println(numberOne / numberTwo);
				break;
			case '+':
				System.out.println(numberOne + numberTwo);
				break;
			case '-':
				System.out.println(numberOne - numberTwo);
				break;
			case '%':
				System.out.println(numberOne % numberTwo);
				break;
			case '^':
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