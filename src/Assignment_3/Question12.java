package Assignment_3;

import java.util.Scanner;

//12.	Write a program to accept the roll, name, and nationality of the person and
//      display those values in good format.

public class Question12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter the name : ");
		String name = input.nextLine();
		
//		System.out.println("Enter the last name : ");
//		String Lname = input.next();
		System.out.println("Enter the Nationality: ");
		String nat = input.next();
		System.out.println("Enter the age: ");
		int r = input.nextInt();

		System.out.println("==========DISPLAY======");

		System.out.println("\n");

		System.out.println("The information of the individual is:\n ");
		System.out.println("Age:\t " + r);

		System.out.println("First Name:\t " + name);

//		System.out.println("Last Name:\t " + Lname);

		System.out.println("Nationality:\t " + nat);

		input.close();

	}

}
