package Assignment_3;

import java.util.Scanner;

public class Question10_b {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
	System.out.println("enter a: ");
		double a = input.nextDouble();
	System.out.println("enter b: ");
		double b = input.nextDouble();
		System.out.println("enter c: ");
		double c = input.nextDouble();
		
		double s1 = (a+b+c)/2;
		System.out.println(s1);
		
		double area = Math.sqrt(s1*(s1-a)*(s1-b)*(s1-c));
		
		System.out.println("The area is : " +area);
    	input.close();

	}

}
