package Assignment_3;

import java.util.Scanner;

public class Question25_new {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n = input.nextInt();
		
		int maxScore = 0;
		String name1 =" ";
		for (int i = 1; i <=n; i++) {
			
			System.out.println("Enter the name of student:");
			String name = input.next();
			System.out.println("Enter the score:");
			int score = input.nextInt();
			if (maxScore<score) {
				
				maxScore = score;
				name1 = name;
			}
			
			
		}

		
		System.out.println("The name with max score is " +maxScore+" of "+name1);
	input.close();
	}

}
