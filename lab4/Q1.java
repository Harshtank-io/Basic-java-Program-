// WAP to give number b/w 2 number which are divisble by 2 but no 3

import java.util.*;

class Q1{
	public static void main (String [] args ){

		Scanner sc = new Scanner(System.in);

		int n1 , n2 ;

		System.out.print("Enter the number num1 : ");
		n1 = sc.nextInt();
		System.out.print("Enter the number num2 : ");
		n2 = sc.nextInt();

		for(int i = n1 ; i <= n2 ; i++){
			if (i%2 == 0 && i%3 != 0)
				System.out.print(i +" ");
		}
	}
} 