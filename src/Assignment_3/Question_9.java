package Assignment_3;

import java.util.Scanner;

//9.	Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg

public class Question_9 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of weight in pounds:");
		double p = input.nextDouble();

		double m = p*0.454;
		System.out.println("The weight " +p+ " pounds is "+m+" in kgs. " );

	}

}
