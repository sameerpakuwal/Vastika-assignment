package Assignment_3;

import javax.swing.JOptionPane;

//6.	Write a program to find the perimeter of a circle, triangle, and rectangle.
public class Question_6 {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		
	
		String message1="Calculation of Perimeter of circle";
		
		JOptionPane.showInternalMessageDialog(null, message1 );
		
		String cp = JOptionPane.showInputDialog("Enter the radius of the circle: ");
		double r = Double.parseDouble(cp);
		double poc = 2*PI*r;
		JOptionPane.showMessageDialog(null, +poc);
		
		String message2 = "Calculation of Perimeter of triangle";
		JOptionPane.showMessageDialog(null, message2);
		
		String t_a = JOptionPane.showInputDialog("Enter length of the first side");
		double t_av = Double.parseDouble(t_a);
		String t_b = JOptionPane.showInputDialog("Enter length of the second side");
		double t_bv = Double.parseDouble(t_b);
		String t_c = JOptionPane.showInputDialog("Enter length of the third side");
		double t_cv = Double.parseDouble(t_c);	
		
		double pot = t_av+t_bv+t_cv;
		JOptionPane.showInternalMessageDialog(null, +pot);
		
		String message3 = "Calculation of Perimeter of Rectangle";
		JOptionPane.showMessageDialog(null, message3);
		
		String r_l = JOptionPane.showInputDialog("Enter length of rectangle");
		double r_lv = Double.parseDouble(r_l);
		String r_w = JOptionPane.showInputDialog("Enter width of rectangle");
		double r_wv = Double.parseDouble(r_w);
		
		
		double por = 2*(r_lv+r_wv);
		JOptionPane.showInternalMessageDialog(null, +por);
		
		
		
		
		

	
	}

}
