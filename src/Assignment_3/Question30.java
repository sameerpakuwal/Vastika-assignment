package Assignment_3;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 'n' number to calculate the value for given series :");
		int n = input.nextInt();

		int a = 0;
		int b;
		int c;
		int temp1 = 1, temp2 = 1;
		System.out.println("The fibonacci series up to " + (n) + "th term is given as ");
		System.out.print(temp1 + "\t");
		System.out.print(temp2 + "\t");
		for (int i = 0; i <= (n - 3); i++) {

			a = temp1;
			b = temp2;
			c = a + b;
			temp1 = b;
			temp2 = c;

			System.out.print(c + "\t");

		}
	}

}
