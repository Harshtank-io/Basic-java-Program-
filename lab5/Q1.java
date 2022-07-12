// WAP to calculate Simple Intrest 

import java.util.*;

class Q1{

	static void SI(double principal , double rate , double time ){

		// calcualting the simple interest 
		double si = principal * rate  * time ; 

		System.out.print("Simple Interest is "+si);

	}
	public static void main (String[] args){

		double principal , rate , time;

		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter the Principal Amount : ");
		principal = sc.nextDouble();

		System.out.print("Enter the Rate of Interest  : ");
		rate = sc.nextDouble();

		System.out.print("Enter the Time : ");
		time = sc.nextDouble();

		SI(principal , rate , time );

	}
}