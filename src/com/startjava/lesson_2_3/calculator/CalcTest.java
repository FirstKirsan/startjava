package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalcTest {
	public static void main (String[] args) {
		String answer = "да";
		Scanner scan = new Scanner(System.in);
        String[] arrayMathExpression = new String[3];
        String mathExpression;
        Calc calc = new Calc();

        System.out.println("Калькулятор запущен.");
        while (answer.equals("да")) {
            System.out.print("ВВедите математическое выражение: ");
            mathExpression = scan.nextLine();
            arrayMathExpression = mathExpression.split(" ");
            calc.setNumberOne(Integer.parseInt(arrayMathExpression[0]));
            calc.setMathOperation(arrayMathExpression[1].charAt(0));
            calc.setNumberTwo(Integer.parseInt(arrayMathExpression[2]));
            calc.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }        
        System.out.println("Калькулятор завершен.");
	}
}