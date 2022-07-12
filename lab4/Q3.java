// WAP to check wheather the given nummber is prime or not 

import java.util.*;

class Q3{
	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		int n , prime = 0;

		System.out.print("Enter the number : ");
		n = sc.nextInt();

		for(int i = 2 ; i < n ; i++){
			if (n % i == 0){
				prime = 1;
				break;
			}
	}
	if (prime == 1 )
				System.out.print(n + " is Prime !!");
			else 
				System.out.print(n+ " is not Prime !!");
		}
}