// WAP to define class of student and result 

import java.util.*;

class Student {

		Scanner sc = new Scanner(System.in);

		int Enrollment_no , semester;
		String student_name;
		//string course;

	public void getStudentDetails(){

		System.out.println("Enter Details :-");
		System.out.print("Enter the Enrollment No : ");
		Enrollment_no = sc.nextInt();

		System.out.print("Enter the student_name : ");
		student_name = sc.next();

		System.out.print("Enter the semester : ");
		semester = sc.nextInt();
	}
}

class Result {

		int Enrollment_no;
		int cpi , spi ,semester;
		Scanner sc = new Scanner(System.in);


	public void  getResultDetails(){

		System.out.println("Enter Details :-");
		System.out.print("Enter the Enrollment No : ");
		Enrollment_no = sc.nextInt();

		System.out.print("Enter the semester : ");
		semester = sc.nextInt();

		System.out.print("Enter the CPI : ");
		cpi = sc.nextInt();

		System.out.print("Enter the SPI : ");
		spi = sc.nextInt();  
	}

	// Displaying the result
	public void Display(Student st[] , int i){
		System.out.print("Enrollment_no : " + Enrollment_no);
		System.out.print("Name : "+st[i].student_name);
		System.out.print("semester : "+ semester);
		System.out.print("CPI : "+ cpi);
		System.out.print("SPI : "+ spi);
	}
}

class Q1{

	public static void main(String [] args ){

		int n ,	Enrollment_no , i;

		boolean found = false;

		Scanner sc = new Scanner(System.in);

		// Getting the number of Student 
		System.out.print("Enter the Number of Student : ");
		n = sc.nextInt();

		// starting the object 

		Student st[] = new Student[n];
		Result r[] = new Result[n];

		for( i = 0 ; i < n ; i++ ){
			st[i] = new Student();
			r[i] = new Result();
			st[i].getStudentDetails();
			r[i].getResultDetails();

		}

		// Finding the Student 
		System.out.print("Enter the Enrollment no - ");
		Enrollment_no = sc.nextInt();

		for( i =0 ; i < n ; i++){
			if (Enrollment_no == st[i].Enrollment_no){
				found = true;
				break;
			}

		}

		// Displaying the student exist or not.
		if(found == true )
			System.out.print("Found !! ");
		else 
			System.out.print("Not Found !! ");
	}
}