package Assignment_4;

import java.util.Scanner;

public class Question17_Method {

	public static void leapYear()
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = input.nextInt();

		if ((year % 100 == 0) && (year % 400 == 0))

		{
			System.out.println("The year " + year + " is a leap year.");

		}

		if ((year % 100 != 0) && (year % 4 == 0)) {

			System.out.println("The year " + year + " is a leap year.");
		} else

		{
			System.out.println("The year " + year + " is not a leap year.");
		}
		
	}
	
	public static void main(String[] args) {
		
		leapYear();
		
		System.out.println("Well-Done!!");

	}

}
