public class Calc {
	public static void main (String[] args) {
		int firstNumber = 3;
		int secondNumber = 5;
		char mathmathOperationation = '-';
		if (mathmathOperationation == '*') {
			System.out.println(firstNumber*secondNumber);
		} else if (mathOpera == '/') {
			System.out.println(firstNumber/secondNumber);
		} else if (mathOperation == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if (mathOperation == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if (mathOperation == '%') {
			System.out.println(firstNumber % secondNumber);
		} else if (mathOperation == '^') {
			int result = 1;
			for (int i = 0; i < nsecondNumber; i++ ) {
				result *= firstNumber;
			}
			System.out.println(result);
		} else System.out.println("Unknown mathOperationation");
	}
}