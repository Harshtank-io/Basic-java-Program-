// Matrix multipilication 
import java.util.*;

class Q6{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int row , col , a[][] , b[][] ,c[][];

		System.out.print("Enter the number of row : ");
		row = sc.nextInt();
		System.out.print("Enter the number of colum : ");
		col = sc.nextInt();

		a= new int [row][col] ;
		b= new int [row][col] ;
		c= new int [row][col] ;

		// Getting Elements of the 1st matrix 
		for(int i =0 ; i< row ; i++){
			for(int j =0 ; j< col ; j++){
				System.out.print("Enter the a["+(i+1)+"] ["+(j+1)+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		// Getting Elements of the 2st matrix 
		for(int i =0 ; i< row ; i++){
			for(int j =0 ; j< col ; j++){
				System.out.print("Enter the b["+(i+1)+"] ["+(j+1)+"] : ");
				b[i][j] = sc.nextInt();
			}
		}

		// Multiplication 
		
			for(int i =0 ; i< row ; i++){
				for(int j =0 ; j< col ; j++){
					c[i][j] = a[i][j] * b[i][j];
			}
	}

		// Displaying the matrix 
		System.out.println("Matrix :- ");
		
			for(int i =0 ; i< row ; i++){
				for(int j =0 ; j< col ; j++){
				
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
