// WAP to Create array of object for Student-Details (Enrollment_No, Name, Sem , CPI)

 
import java.util.*;

class Student{

		int Enrollment_No, sem , cpi;
		String Name;


	// Creating the method for student details 
	public void Student_Details(){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Enrollment_No :- ");
		Enrollment_No = sc.nextInt();
		
		System.out.print("Enter Name :- ");
		Name  = sc.next();
		
		System.out.print("Enter Sem :- ");
		sem = sc.nextInt();
		
		System.out.print("Enter CPI :- ");
		cpi = sc.nextInt();
	}

	// Displaying the Details of the student 
	void displayStudent(){

		System.out.println();
		System.out.println("Enrollment_No :- "+Enrollment_No);
		System.out.println("Name :- "+Name);
		System.out.println("Sem :- "+sem);
		System.out.println("CPI :- "+cpi);

	}

}
class Q2{
	public static void main(String [] args){

		int n;
		Scanner sc = new Scanner(System.in);
		
	    // Getting the Size of the object 
	    System.out.print("Enter Number of the student :- ");
	    n= sc.nextInt();

	    // creating the object 
	    Student st[] = new Student[n];
	    for(int i =0 ; i <n ; i++){
	    	st[i] = new Student();
	    	System.out.println("Enter the student-"+(i+1)+" Details :-");
	    	st[i].Student_Details();
	    }

	    //Calling Method of the Displaying the details of the Student 
	     for(int i =0 ; i <n ; i++){
	    	st[i].displayStudent();
	    }
	}
}