package Assignment_3;

import java.util.Scanner;

//40.	Write a program to reverse the string.
public class Question40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to reverse.");
		String s1 = input.nextLine();
		char [] ch = s1.toCharArray();
		//System.out.println(ch.length);
		//System.out.println(ch[0]);
		for (int i =ch.length-1 ; i>=0 ; i--) {
			
			System.out.print(ch[i]);
		}
		

	}

}
