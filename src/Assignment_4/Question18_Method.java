package Assignment_4;

import java.util.Scanner;

public class Question18_Method {

	public static void greatestNumber() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter A:");
		double a = input.nextDouble();

		System.out.println("Enter B:");
		double b = input.nextDouble();

		System.out.println("Enter C:");
		double c = input.nextDouble();

		if ((a > b) && (a > c)) 
			
		{
			System.out.println(" A is the greatest one and its value is:"+a);
		} 
		else if ((b > a) && (b > c))
		{
			System.out.println(" B is the greatest one and its value is:"+b);
		}
		else
		{
			System.out.println(" C is the greatest one and its value is:"+c );
		}
		
		
	}
	public static void main(String[] args) {
		greatestNumber();
		
		System.out.println("Well Done!!");

	}

}
