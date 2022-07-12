// WAP to check whether letter is vowel or not 

import java.util.*;
class Q4{
	public static void main (String [] args ){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Letter : ");
		char le = sc.next().charAt(0);

		if (le == 'a'||le =='e'||le =='i'||le =='o'||le =='u'||le == 'A'||le =='E'||le =='I'||le =='O'||le =='U')
			System.out.print(le +" is Vowel!");
		else
			System.out.print(le+" is Consonet!");


	}
}