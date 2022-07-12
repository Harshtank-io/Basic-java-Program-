//WAP to check Weather number is positive or negative

import java.util.*;

class Q1{
	public static void main (String [] args){


		Scanner n = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		double num =n.nextDouble();

		if (num > 0)
			System.out.println(num+" is Positive!");
		else
			System.out.println(num+" is Neagtive!");
	}
}