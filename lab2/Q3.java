// WAP to convert tempeature from fahrenhiet to clesius 

import java.util.*;


class Q3{
	public static void main(String [] args){

		System.out.println();
		System.out.print("<--------Covert Temperature from Fahrenhiet to Clesius--------->");
		System.out.println();
		System.out.println();
		Scanner sc = new Scanner(System.in); // reading input from user with scanner class 

		System.out.print("Fahrenhiet : ");
		double fahre =sc.nextInt();

		System.out.println();

		double clesius = (fahre - 32)*5/9;

		System.out.print("clesius : " + clesius);


	}
}