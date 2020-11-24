package Assignment_3;

import java.util.Scanner;

public class Question10_c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("enter a: ");
		double a = input.nextDouble();
		System.out.println("enter b: ");
		double b = input.nextDouble();
		System.out.println("enter c: ");
		double c = input.nextDouble();


		double x1 = (-b + Math.sqrt(((b*b)-(4*a*c))))/(2*a);
		double x2 = (-b - Math.sqrt(((b*b)-(4*a*c))))/(2*a);

		System.out.println("The root of the equation is : " + x1+ " and " +x2);
		input.close();
	}

}
