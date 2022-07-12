 // WAP to count the Number of Object Created by the static variable 

import java.util.*;

class Countobj{

	static int count ; 

	// creating the instance block instaed of the constructor 
	{count +=1;}

	 void objcount(){

		System.out.println("Total Object :- "+count);
	}

	
}
class Q3{
	public static void main(String [] args){

		//Initialization Object 
		Countobj co = new Countobj();
		co.objcount();
	}
}