// Get the the details of the Candidate in the differnt class and creat main class and display it. ! !

import java.util.*;

class Candidate{

	// Declareing variable
		int CandidateID;
		String CandidateName;
		int CandidateAge;
		int CandidateWeight;
		double CandidateHeight;

	// Reading the details 
	 void getcandidate(){

		Scanner sc = new Scanner(System.in);

		// Getting the details 
		System.out.print("ID : ");
		CandidateID = sc.nextInt();

		System.out.print("Name : ");
		sc.nextLine();
		CandidateName = sc.nextLine();

		System.out.print("Age : ");
		CandidateAge = sc.nextInt();

		System.out.print("Height : ");
		CandidateHeight = sc.nextDouble();

		System.out.print("Weight :");
		CandidateWeight = sc.nextInt();
	}
	// Displaying the details 

	void displaycadidate(){

		// displaying the details 
		System.out.println();
		System.out.println("Candidate Details :");
		System.out.println();
		System.out.println("Candidate ID :"+CandidateID);
		System.out.println("Candidate Name :"+CandidateName);
		System.out.println("Candidate Age :"+CandidateAge);
		System.out.println("Candidate Weight :"+CandidateWeight);
		System.out.println("Candidate Height :"+CandidateHeight);

	}

}
// Main Class 
class Q1{
	public static void main(String [] args ){

		// Creating Object
		Candidate cn = new Candidate();

		// Calling the method 
		cn.getcandidate();
		System.out.println();
		cn.displaycadidate();
	}
}