// WAP to find out the largest number from given three

import java.util.*;
class Q5{
	public static void main (String [] args ){
		System.out.println();
		System.out.println("<---------Program to find the largest number from given three------->");
		System.out.println();

		Scanner sc = new Scanner(System.in);		

		System.out.print("Number-1 : ");
		int num1 = sc.nextInt();
		System.out.println();

		System.out.print("Number-2 : ");
		int num2 = sc.nextInt();
		System.out.println();
		
		System.out.print("Number-3 : ");
		int num3 = sc.nextInt();
		System.out.println();
		
		int largest = (num1>num2&&num1>num3?num1:num2>num3?num2:num3);

		System.out.print(largest+" is the largest !!");
		System.out.println();

	}
}