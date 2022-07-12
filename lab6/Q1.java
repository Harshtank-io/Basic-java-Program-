// WAP to count the number of Even or Odd number from given array ! !

import java.util.*;

class Q1{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);

		int n , arr[] , even = 0 , odd = 0 ;

		System.out.println("Enter the number of array : ");
		n = sc.nextInt();

		// givening size of array 
		arr = new int[n];

		// getting elements of the array 
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println("Enter the element "+ arr[i] + " : ");
			arr[i] = sc.nextInt();
		}

		// Counting the even and the odd elments 
		for(int i =0; i <arr.length;i++){
			if (arr[i]%2 == 0 )
				even++;
			else
				odd++;
		}

		System.out.println("Even = "+ even +" , "+"Odd = " + odd );
	}
}