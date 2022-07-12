// WAP to display the vowels it the String

import java.util.*;

class Name{
	public static void main(String [] args){

		// decalring the variables
		String st ;
		char ch ;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Strings : ");
		st = sc.nextLine();

		System.out.println("Vowels in the Strings are : ");
		
		for(int i =0 ; i < st.length(); ++i){
		ch = st.charAt(i);
		swtich(ch){

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':count=1;
		}
	}
	if(count == 0 ) System.in.println("There is no vowels!!");

	}
}