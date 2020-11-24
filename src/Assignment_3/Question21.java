package Assignment_3;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		String a ;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number from 1 to 7 to print the corresponding day in a week: ");
		a = input.next();
	String result;

		switch (a) {
		case "1":
			result = "Sunday";
			break;

		case "2":
			result= "Monday";
			break;
		case "3":
			result= "Tuesday";
			break;
		case "4":
			result= "Wednesday";
			break;
		case "5":
			result= "Thursday";
			break;
		case "6":
			result= "Friday";
			break;
		case "7":
			result= "Saturday";
			break;

		default:
			System.out.println("Error!! Invalid number");
			return;

		}
		System.out.printf("The answer is " + result+".");
		input.close();

	}

}
