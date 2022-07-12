// WAP to find the class according to the percentage !!

import java.util.*;
class Q4{
	public static void main(String [] args ){

		System.out.println();
		System.out.print("<------Program to classifie the class according to percentage----->");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int  m1,m2,m3,m4,m5; // 5 subject marks 

		System.out.print("Number-1 :");
		m1 = sc.nextInt();
		System.out.println();

		System.out.print("Number-2 :");
		m2 = sc.nextInt();
		System.out.println();

		System.out.print("Number-3 :");
		m3 = sc.nextInt();
		System.out.println();	

		System.out.print("Number-4 :");
		m4 = sc.nextInt();
		System.out.println();

		System.out.print("Number-5 :");
		m5 = sc.nextInt();
		System.out.println();

		double average = m1+m2+m3+m4+m5/5;

		double percentage = (average/500)*100;

		System.out.print("Percentage : "+percentage);
		System.out.println();

		if(percentage < 35)
			System.out.print("Fail !!");
		else if(percentage > 35 && percentage < 45)
			System.out.print("Pass !!");
		else if (percentage > 45&& percentage <60)
			System.out.print("Second Class !!");
		else if (percentage > 60&& percentage<70)
			System.out.print("First Class !!");
		else 
			System.out.print("Distinction !!");

		System.out.println();

	}

}