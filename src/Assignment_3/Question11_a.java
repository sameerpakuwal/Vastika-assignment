package Assignment_3;

//11.	Write a program to swap two numbers
//a) using temporary variable


public class Question11_a {

	public static void main(String[] args) {
		
		double x=4.5, y = 6.7;
		
		System.out.println("======Before swap======\n");
		System.out.println("x = "+x+"\t\ty = "+y+"\n\n");
		System.out.println("======After swap======\n");
		
		double temp = x;
		x=y;
		y=temp;
		
		System.out.println("x = "+x+"\t\ty = "+y);
		
		
		
	}

}
