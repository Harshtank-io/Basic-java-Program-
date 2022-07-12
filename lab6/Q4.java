// Bubble sort 

import java.util.*;

class Q4{
	static void bubble_sort(int arr[]){
		int temp;
		for(int i = 1 ; i <arr.length ; i++){
		   for(int j = 0 ; j <arr.length-i; j++){
	    	if (arr[j] > arr[j+1]){
	    		temp = arr[j];
	    		arr[j] = arr[j+1];
	    		arr[j+1] = temp;
	     	 }   	
	    	}
	    }
	    // Displaying the array in order
	    System.out.print("Sorted array : ");
	    for(int i =0 ; i<arr.length ; i++){
	    	System.out.print(arr[i]+" ,");
	    }
	}
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int n , arr[] , x;

		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();
		System.out.println();
		
		arr = new int [n];

	    for(int i = 0 ; i <arr.length ; i++){
	    	System.out.print("Enter the elment "+i+" : ");
	    	arr[i] = sc.nextInt(); 
	    }
	    bubble_sort(arr);

	}
}

