package Assignment_3;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many lines of pattern do you want :");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {

			//System.out.print(i);
			System.out.println("\n");
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"\t");
			}

		}
		input.close();

	}

}
