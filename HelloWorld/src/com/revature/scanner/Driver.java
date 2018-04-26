package com.revature.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Math m = new Math();
		double number1;
		double number2;
		String Fnumber;
		String Snumber;
		String operator = " ";

		Scanner sc = new Scanner(System.in);
		do {

			try {

				System.out.print("Number1 : ");
				Fnumber = sc.next();

				number1 = Double.parseDouble(Fnumber);

				System.out.print("number 2: ");
				Snumber = sc.next();
				number2 = Double.parseDouble(Snumber);

				System.out.print("Please enter operator:");
				operator = sc.next();

				if (operator.contains("+")) {
					m.add(number1, number2);
				}

				else if (operator.contains("-")) {
					m.subtract(number1, number2);
				}

				else if (operator.contains("*")) {
					m.multiply(number1, number2);
				}

				else if (operator.contains("/")) {
					m.divide(number1, number2);
				}

				else {
					System.out.print("Not a valid operator");
				}

			} catch (NumberFormatException e) {
				System.out.println("Pleae Input valid Number Is invalid");
				

			}
			System.out.println("Please enter 5 to exit: ");
			System.out.println("press 1 to continue:");
			operator = sc.next();

		} while (!operator.contains("5"));
		sc.close();
	}

}
