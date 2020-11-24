package Assignment_3;

import java.util.Scanner;

public class Question20Switch {

	public static void main(String[] args) {

		int a=0, b=0, result =0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first integer number: ");
		a = input.nextInt();
		System.out.println("Enter the second integer number: ");
		b = input.nextInt();
		System.out.println("Enter the operator sign:  '/' or '*' or '+' or '-'");
		char c = input.next().charAt(0);
		

		switch (c) {
		case '+':
			result = a + b;
			break;

		case '*':
			result= a * b;
			break;
		case '-':
			result = a - b;
			break;
		case '/':
			result = a / b;
			break;

		default:
			System.out.println("Error!! Invalid operator");
			return;

		}
		System.out.printf("The answer is " + result);
		input.close();
	}
}
