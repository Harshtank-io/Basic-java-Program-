// WAP to find out largest number from given three

import java.util.*;

class Q3{
	public static void main(String[]args){

		System.out.println();
		System.out.print("<------Program to find the largest number from given three------->");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;

		System.out.print("Number-1 :");
		num1 = sc.nextInt();
		System.out.println();

		System.out.print("Number-2 :");
		num2 = sc.nextInt();
		System.out.println();

		System.out.print("Number-3 :");
		num3 = sc.nextInt();
		System.out.println();

		if(num1 > num2)
		{
			if (num1 > num3)
				System.out.print(num1+" is the largest!!");
			else
				System.out.print(num3+" is the largest!!");
		}
		else if(num2 > num1)
		{
			if (num2 > num3)
				System.out.print(num2+" is the largest!!");
			else
				System.out.print(num3+" is the largest!!");
		}
		else{
			System.out.print(num3+" is the largest!!");
			System.out.println();
		}


	}
}