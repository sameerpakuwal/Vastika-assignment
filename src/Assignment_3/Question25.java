package Assignment_3;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the students : ");
		int n = input.nextInt();

		int num[] = new int[n];
		String name[] = new String[n];
		double score[] = new double[n];
		double hScore = 0.0;
		String hName =null;

		for (int i = 0; i < n; i++)
		{
			
			System.out.println("Enter the name of the student "+i);
			name[i] = input.next();
			System.out.println("Enter the student number for student:"+i);
			num[i] = input.nextInt();
			System.out.println("Enter the score of the student"+i);
			score[i]=input.nextDouble();
			if (hScore<score[i]) {
				hScore = score[i];
				hName = name[i];
			}
		}

		

		
		System.out.println("The list of the student information is as below: ");
		System.out.println("\n");
		System.out.println("  No    Name     Score");
		System.out.println("\n");
		for (int i = 0; i < n; i++)
		{
         System.out.println(" "+num[i]+"\t"+name[i]+"\t"+score[i]);
		}
		
		System.out.println("\n");
		System.out.println(hName+" is the highest scorer with "+hScore+" marks");
		
	}

}
