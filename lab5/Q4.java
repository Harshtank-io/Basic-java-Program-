// WAP to check weather the number is prime or not ! !

import java.util.*;

class Q4{
	static int check(int n){
		for(int i =2 ; i < n; i++ ){
			if (n%i == 0)
				return 0;
		}
		return 1 ;
	}
	public static void main(String [] args){

		int n ,prime;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		n = sc.nextInt();

		prime = check(n);

		if (prime == 0)
			System.out.print(n + " is not a prime !!!");
		else
			System.out.print(n + " is a prime !!!");
	}
}