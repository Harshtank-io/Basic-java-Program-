// Selection Sort 

import java.util.*;

class Q7{
	static void Selection_sort(int arr[]){
		int temp ;
		// Logic for the selection sort 
		for(int i  =0 ; i <arr.length ; i++){
			for (int j =i+1; j<arr.length ;j++ ) {
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// Displaying the Array 
		System.out.print("Sorted Array : ");
			for (int i =0 ; i < arr.length ;i++ ) {
				System.out.print(arr[i]+" ");
			}
	}
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int n , arr[] ,temp;

		System.out.print("Enter the Size of thee Array : ");
		n = sc.nextInt();

		arr = new int [n];
		for(int i =0 ; i < arr.length ; i++){

			System.out.print("Enter the Array Elements : ");
			arr[i]= sc.nextInt();
		}
		// Calling the method 
		Selection_sort(arr);
	}
}