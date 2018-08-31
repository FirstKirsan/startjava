package com.startjava.lesson_2_3.calculator;

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
				System.out.println(Math.multiplyExact(numberOne, numberTwo));
				break;
			case '/':
				System.out.println(numberOne / numberTwo);
				break;
			case '+':
				System.out.println(Math.addExact(numberOne, numberTwo));
				break;
			case '-':
				System.out.println(Math.subtractExact(numberOne, numberTwo));
				break;
			case '%':
				System.out.println(Math.IEEEremainder(numberOne, numberTwo));
				break;
			case '^':
				System.out.println(Math.pow(numberOne, numberTwo));
				break;
			default: 
				System.out.println("Неизвестная операция");
		}
	}
}