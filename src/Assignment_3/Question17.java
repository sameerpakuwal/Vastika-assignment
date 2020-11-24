package Assignment_3;

import java.util.Scanner;

//   Find the given is leap year or not?

public class Question17 {

	public static void main(String[] args) {

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

}
