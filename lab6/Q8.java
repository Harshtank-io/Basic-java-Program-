// WAP to read 4X4 matrix and calculate the sum of the row and sum of the column

// Matrix multipilication 
import java.util.*;

class Q8{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int row = 4, col =4 ;
		int a[][] , colsum[] , rowsum[];

		a= new int [row][col] ;
		colsum = new int [col];
		rowsum = new int [row];
		
		// Getting Elements of the 1st matrix 
		for(int i =0 ; i< row ; i++){
			for(int j =0 ; j< col ; j++){
				System.out.print("Enter the a["+(i+1)+"] ["+(j+1)+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		// Getting the sum
		for (int i =0 ;i <row ;i++ ) {
			rowsum[i] = colsum[i] = 0;
			for (int j = 0 ; j< col ;j++ ) {
				rowsum[i]+=a[i][j];
				colsum[i]+=a[j][i];
			}
		}
		// Displaying the matrix 
		for(int i = 0; i <= row ; i++){
			for (int j =0 ;j<= col ;j++ ) {
				if (i == row)
					System.out.print(colsum[j]+"\t");
		//		else
		//			System.out.print(a[i][j]+"\t");
			}
			if(i != row )
				System.out.print(rowsum[i]);
		}
	}
}
