// Finding the lenght of the string\
// With out using the inbuilt

import java.util.*;

class Q1{
	public static void main(String [] args ){

		Scanner sc = new Scanner(System.in);

		// Getting the String
		String st ;
		//For counting the Characters
		int count = 0 ;

		System.out.print("Enter the String : ");
		st = sc.nextLine();

		char ch [] = st.toCharArray();

		// Yes new Syntax of the For loop
		for(char s : ch){
			// Trying to remove the space form the String 
			//String p = " ";
			//if( s.equals(p))
			//	count--;
			//else
				count++;
		}

		System.out.println("Lenght of the String is : " + count);

	}
}