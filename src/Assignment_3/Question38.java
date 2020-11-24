package Assignment_3;

import java.util.Scanner;

//38.	Write a program to check whether a given string is palindrome or not.
public class Question38 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the word to check if it is palindrome or not?");
		String word = input.next();
		StringBuilder sb = new StringBuilder(word);
		StringBuilder rev = sb.reverse();
		

//		System.out.println(word);
//		System.out.println(rev);
//		
//		System.out.println(word.contentEquals(rev));

		if (word.contentEquals(rev)) {

			System.out.println("The word '" + word + "' is a palindrome.");
		} else {

			System.out.println("The word '" + word + "' is not a palindrome.");
		}

	}

}
