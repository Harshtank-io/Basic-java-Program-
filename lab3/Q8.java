// WAP to Genrate phone bill of calls given by the user 

import java.util.*;


class Q8{
	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		int calls ;
		double bill;

		System.out.print("Enter the of Calls : ");
		calls = sc.nextInt();

		if (calls <= 100 )
			bill = 200;
		else if (calls > 100 && calls <= 150)
			bill = 200 + (0.60 * (calls - 100));
		else if (calls > 150 && calls <= 200)
			bill = 200 + (0.60 * 0.50 )+(0.50 *(calls - 150));
		else 
			bill = 200 + (0.60 * 50 )+(0.50 * 50 )+(0.40 *(calls - 200));

	    System.out.print("Calls Bill is : "+ bill);


	}
}