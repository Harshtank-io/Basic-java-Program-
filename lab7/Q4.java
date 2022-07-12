// Get the the details of the Student in the differnt class and creat main class and display it. ! !

import java.util.*;

class Student{

	// Declareing variable
		int Enrollment_no;
		String StudentName;
		int Semester;
		int CPI;
		int SPI;

	// Reading the details 
	 void getStudent(){

		Scanner sc = new Scanner(System.in);

		// Getting the details 
		System.out.print("ID : ");
		Enrollment_no = sc.nextInt();

		System.out.print("Name : ");
		sc.nextLine();
		StudentName = sc.nextLine();

		System.out.print("Age : ");
		Semester = sc.nextInt();

		System.out.print("SPI : ");
		SPI = sc.nextInt();

		System.out.print("CPI :");
		CPI = sc.nextInt();
	}
	// Displaying the details 

	void displayStudent(){

		// displaying the details 
		System.out.println();
		System.out.println("Student Details :");
		System.out.println();
		System.out.println("Student ID :"+Enrollment_no);
		System.out.println("Student Name :"+StudentName);
		System.out.println("Student Age :"+Semester);
		System.out.println("Student CPI :"+CPI);
		System.out.println("Student SPI :"+SPI);

	}

}
// Main Class 
class Q1{
	public static void main(String [] args ){

		// Creating Object
		Student cn = new Student();

		// Calling the method 
		cn.getStudent();
		System.out.println();
		cn.displayStudent();
	}
}