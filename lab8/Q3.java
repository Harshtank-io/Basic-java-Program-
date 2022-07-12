// WAP to add two complex Numbers 

import java.util.*;

class Complex {

	// creating the variable 
	int real , img ;
	int totalreal ,totalimg;

	Complex(){
		
		Scanner sc = new Scanner(System.in);

		// taking the Number form user 
		System.out.print("Enter the Real Number : ");
		real = sc.nextInt();
		System.out.println();

		System.out.print("Enter the imginary Number : ");
		img = sc.nextInt();
		System.out.println();

	}

	void addNumber(Complex cn2){

		// adding the number 
		totalreal = real + cn2.real;
		totalimg = img + cn2.img;
	}

	void display(){

		System.out.println("Total : "+ totalreal +" + "+totalimg+"i" );
	}
}
class Q3{
	public static void main(String [] args){
		
		// Creating the Objects 

		Complex cn1 = new Complex();
		Complex cn2 = new Complex();

		//Call methods 
		cn1.addNumber(cn2);
		cn1.display();


	}
}