// WAP to get the elements of the matrix and print it in matrix 

import java.util.*;

class Q5{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int row , col , arr[][];

		System.out.print("Enter the number of row : ");
		row = sc.nextInt();
		System.out.print("Enter the number of colum : ");
		col = sc.nextInt();

		arr = new int [row][col] ;

		for(int i =0 ; i< row ; i++){
			for(int j =0 ; j< col ; j++){
				System.out.print("Enter the a["+(i+1)+"] ["+(j+1)+"] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		//Displaying the Matrix
		System.out.println("Matrix :- ");
		for(int i =0 ; i< row ; i++){
			for(int j =0 ; j< col ; j++){
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}