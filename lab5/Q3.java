// WAP to print Fibonacci Sequence

import java.util.*;

class Q3{

	// method
	static void fib(int n){
		int n1 =1 , n2 =1 ,temp;

		for(int i =0 ; i<=n ; i++){
			System.out.print(n1 + ",");
			temp = n2 ;
			n2  = n1 + n2 ;
			n1 = temp;
		}
	} 
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Enter the number : ");
		n = sc.nextInt();

		// Method calling 
		fib(n);
	}
}