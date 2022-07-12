// WAP to Convert meter into feet

import java.util.*;

class Q5{
	public static void main (String [] args ){

		System.out.println("<-----Program for meter to feet convertion------>");

		Scanner m = new Scanner(System.in);

		System.out.print("Meter : ");
		double meter = m.nextDouble();

		System.out.println();

		double feet = meter/0.3048;

		System.out.println("Feet : "+feet);
	}
}