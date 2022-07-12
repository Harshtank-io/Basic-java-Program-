// WAP to reverse a number 

import java.util.*;

class Q5{
	public static void main(String[] args ){

		Scanner sc = new Scanner(System.in);

		int n , rev = 0 , temp;

		System.out.print("Enter the number : ");
		n = sc.nextInt();

		while(n != 0){
			temp = n % 10;
			rev  = rev * 10 + temp;
			n /= 10;
		}
		System.out.print(rev);
	}
}