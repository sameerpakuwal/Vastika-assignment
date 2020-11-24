package Assignment_3;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word.");
		String s1 = input.next();
		char[] ch = s1.toCharArray();
		for (int i = 0; i <= ch.length-1; i++) {
			for (int j = 0; j < i; j++) {
				if (ch[i]==(ch[j])) {
					
					System.out.println(ch[i]+" is a duplicate word");
			}
			
				
				
			}
			
			
		}
	}

}
