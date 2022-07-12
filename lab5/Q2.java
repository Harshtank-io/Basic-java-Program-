// WAP to find maximum number 

import java.util.*;

class Q2{
	static void Max(int n1 , int n2 ){
		if (n1 > n2 )
			System.out.print(n1 + " is the Maximum !!");
		else if (n2 > n1 )
			System.out.print(n2 + " is the Maximum !!");
		else
			System.out.print("Both are Equal ");
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n1 , n2 ;

		System.out.print("Enter num1 : ");
		n1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		n2 = sc.nextInt();

		// Method Calling 
		Max(n1 , n2);

	}
}