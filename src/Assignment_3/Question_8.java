package Assignment_3;

import java.util.Scanner;

//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Question_8 {

	public static void main(String[] args) {

		// (1°C × 9/5) + 32 = 33.8°F  ----- conversion formula

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of temperature in Celsius:");
		double c = input.nextDouble();

		double f = ((c*9)/5)+32;
		System.out.println("The temperature in Fahrenheeit is :"+f);

		
			//(32°F − 32) × 5/9 = 0°C   ----- conversion formula
		System.out.println("Enter the value of temperature in Fahrenheit:");
		double t = input.nextDouble();

		double c1 = ((5*(t-32))/9);
		System.out.println("The temperature in Fahrenheeit is :"+c1);
		input.close();
		

	}

}
