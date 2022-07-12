//  WAP to check Weather the String is Palidrome or not 

import java.util.*;

class Q2{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		String st  , pal = "";

		System.out.print("Enter the string : ");
		st = sc.nextLine();

		int len = st.length();

		for(int i= len-1 ; i>=0;i--){
			pal = pal + st.charAt(i);

			if(st.equals(pal)){
				System.out.println(st + " is a palindrom");
				break;
			}
			else{ 
				System.out.println(st+ " is not a palindrom ");
				break;
			}
		}



	}
}