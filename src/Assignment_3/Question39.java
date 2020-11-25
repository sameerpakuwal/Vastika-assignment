package Assignment_3;

import java.util.Scanner;

//39.	Write a Program to display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh
public class Question39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the full name of a person");
		String fullName = input.nextLine();
		
		String [] words = fullName.split(" ");
		System.out.println();
		System.out.print("The short for of the full name is : ");
		for (int i = 0; i < words.length -1; i++) {
			
				char [] ch = words[i].toCharArray();
				System.out.print(ch[0]);
				System.out.print(". ");
		}
		
		System.out.println(""+words[words.length -1]);
		
	}

}
