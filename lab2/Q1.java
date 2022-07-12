 // WAP to add 2 number with scanner

import java.util.*;
class Q1{
	public static void main (String [] args){
		System.out.println();
		System.out.println("/*------------Program For add a 2 Number with Scanner-------------*/");
		System.out.println();


		Scanner r = new Scanner(System.in);

		System.out.print("Enter the Num-1 : ");
		int num1 = r.nextInt();
		System.out.println();

		System.out.print("Enter the Num-2 : ");
		int num2 = r.nextInt();
		System.out.println();


		int num3 = num1+num2;

		System.out.println("Sum : "+num3);
		


}
	}
