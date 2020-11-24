package Assignment_3;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number the you want to perform math :");
		int n = input.nextInt();
		int nn = n;
		int sumOfNumbers = 0;
		int multOfNumbers = 1;

		while (n != 0) {

			int temp1 = n % 10;
			sumOfNumbers = sumOfNumbers + temp1;
			n = n / 10;
		}
		n = nn;

		while (n != 0) {
			int temp2 = n % 10;
			multOfNumbers = multOfNumbers * temp2;
			n = n / 10;
		}
		System.out.println("The sum of the numbers in " + nn + " is " + sumOfNumbers + ".");
		System.out.println("The multiplication of the numbers in " + nn + " is " + multOfNumbers + ".");
		input.close();
	}

}
