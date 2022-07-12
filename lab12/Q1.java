// WAP to prompts the user to enter 5 numbers store in a arrayList and Display 
// it in the increasing order 

import java.util.*;
import java.util.ArrayList;


class Q1{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		// Creating the ArrayList of Integers 
		ArrayList<Integer> list = new ArrayList<Integer>();

		// prompt the user to enter 5 number 
		System.out.print("Enter 5 number : ");
		for(int i =0 ; i< 5 ; i++)
			list.add(sc.nextInt());

		// Sorting the numbers 
		sort(list);

		// Displaying the list 
		System.out.println(list.toString());

	}

	public static void sort(ArrayList<Integer> list ){
		java.util.Collections.sort(list);
	}
}