package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalcTest {
	public static void main (String[] args) {
		String answer = "да";
		Scanner scan = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.println("Калькулятор запущен.");
        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            calc.setNumberOne(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setMathOperation(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNumberTwo(scan.nextInt());
            calc.start();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }        
        System.out.println("Калькулятор завершен.");
	}
}