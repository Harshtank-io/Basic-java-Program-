// Get the the details of the Empolyee in the differnt class and creat main class and display it. ! !

import java.util.*;

class Empolyee{

	// Declareing variable
		int EmpolyeeID;
		String EmpolyeeName;
		int EmpolyeeAge;
		int Empolyee_Salary;
		
	// Reading the details 
	 void getEmpolyee(){

		Scanner sc = new Scanner(System.in);

		// Getting the details 
		System.out.print("ID : ");
		EmpolyeeID = sc.nextInt();

		System.out.print("Name : ");
		sc.nextLine();
		EmpolyeeName = sc.nextLine();

		System.out.print("Age : ");
		EmpolyeeAge = sc.nextInt();

		System.out.print("Salary :");
		Empolyee_Salary = sc.nextInt();
	}
	// Displaying the details 

	void displayEmployee(){

		// displaying the details 
		System.out.println();
		System.out.println("Empolyee Details :");
		System.out.println();
		System.out.println("Empolyee ID :"+EmpolyeeID);
		System.out.println("Empolyee Name :"+EmpolyeeName);
		System.out.println("Empolyee Age :"+EmpolyeeAge);
		System.out.println("Empolyee Salary :"+Empolyee_Salary);


	}

}
// Main Class 
class Q1{
	public static void main(String [] args ){

		// Creating Object
		Empolyee e = new Empolyee();

		// Calling the method 
		e.getEmpolyee();
		System.out.println();
		e.displayEmployee();
	}
}