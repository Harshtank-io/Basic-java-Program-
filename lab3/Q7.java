// WAP to find the type of the triangle 

import java.util.*;

class Q7 {
	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		int t1 ,t2 ,t3 ;

		System.out.print("Enter the sides of the triagle :  ");
		t1 = sc.nextInt();
		System.out.print(" , ");
		t2 = sc.nextInt();
		System.out.print(" , ");
		t3 = sc.nextInt();

		if (t1 == t2 || t2 == t3 || t3 == t1)
			System.out.print("Triangle is Isosceles !! ");
		else if (t1==t2 && t2 == t3 )
			System.out.print("Triangle is Equilateral !! ");
		else if ((t1*t1)+(t2*t2)==t3*t3 ||(t1*t1)+(t3*t3)==t2*t2||(t3*t3)+(t2*t2)==t1*t1)
			System.out.print("Triangle is Right angle triangle!! ");
		else 
			System.out.print("Triangle is Scalen triangle !! ");


	}
}