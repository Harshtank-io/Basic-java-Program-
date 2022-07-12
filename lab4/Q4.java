// WAP to print the number series 1 + 1/2 + 1/3 + .....


import java.util.*;

class Q4{
	public static void main (String[] args ){

		Scanner sc = new Scanner(System.in);

 		int n;
		double sum =0;

		System.out.print("Enter the number : ");
		n = sc.nextInt();

		for (int i = 1 ; i <= n ; i++)
			sum = sum + 1.0/i;
		System.out.print(sum);
		
	}
}