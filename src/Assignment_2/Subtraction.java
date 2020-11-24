package Assignment_2;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int a, b, sub;
		System.out.println("Enter the minuend (Large number): ");
		a = input.nextInt();
		System.out.println("Enter the subtrahend (Small number): ");
		b = input.nextInt();
	sub = a-b;
		System.out.println("The difference of "+b+" from "+a+" is :" +sub);
	}

}
