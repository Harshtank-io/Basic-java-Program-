// WAP to find percentage of 5 Subjects 

import java.util.*;

class Q4{
	public static void main (String [] args ){
		System.out.print("<--------Program to find percentage-------->");
		System.out.println();
		System.out.println();

		Scanner m = new Scanner(System.in);


		System.out.print("Sub-1 : ");
		double m1 =m.nextDouble();

		System.out.print("Sub-2 : ");
		double m2 =m.nextDouble();

		System.out.print("Sub-3 : ");
		double m3 =m.nextDouble();

		System.out.print("Sub-4 : ");
		double m4 =m.nextDouble();

		System.out.print("Sub-5 : ");
		double m5 =m.nextDouble();

		double average = m1+m2+m3+m4+m5/5;
		double percentage = (average/500)*100;

		System.out.println("The average is : "+average);  //avrage of the marks  
	
		System.out.println("The percentage is : "+percentage);  //percentage of marks 



	}
}