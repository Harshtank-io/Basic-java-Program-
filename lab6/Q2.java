// WAP to read n array and sum the number which are divisible by 3 or 5 !! 

import java.util.*;

class Q2{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);

		int n , arr[] , sum =0;

		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();
		System.out.println();
		
		arr = new int [n];

	    for(int i = 0 ; i <arr.length ; i++){
	    	System.out.print("Enter the elment "+ arr[i]+" : ");
	    	arr[i] = sc.nextInt(); 
	    }

	    	for(int i =0; i <arr.length;i++){
			if (arr[i] %3 == 0 || arr[i] % 5 == 0)
				sum += arr[i];
		}
		System.out.println();
		System.out.println("Sum : "+sum);
	}
}