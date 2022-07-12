// WAP to create time class and Also create addition method to add time objects


import java.util.*;

class Time {

	// deceraring the variable 
	int hour , min , sec;
	
	// getting the time 
	void gettime(){

		Scanner sc = new Scanner(System.in);
		
		System.out.println();

		System.out.print("Enter Hours :- ");
		hour = sc.nextInt();

		System.out.print("Enter minutes  :- ");
		min = sc.nextInt();

		System.out.print("Enter seconds :- ");
		sec = sc.nextInt();

	}
	// Displaying the time 
	void display(){
		System.out.println();
		System.out.println("Hours : "+hour);
		System.out.println("minutes : "+min);
		System.out.println("seconds : "+ sec);
	}

	// Adding the time Objects 
	Time addTime(Time t){

		Time temp = new Time ();

		temp.sec = t.sec + sec;
		temp.min = t.min + min;
		temp.hour = t.hour + hour;

		// for adding the sec and mins if > 60
		if(temp.sec >= 60){
			temp.min += temp.sec/60;
			temp.sec = temp.sec%60;
		}

		if(temp.min >= 60){
			temp.hour += temp.min/60;
			temp.min = temp.min%60;
		}

		return temp;
	}

}

class Q2{
	public static void main(String [] args){

		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();

		// Getting the time 
		t1.gettime();
		t2.gettime();

		//Displaying the time 
		System.out.println("Time - 1 :");
		t1.display();
		System.out.println("Time - 2 :");
		t2.display();

		t3 = t1.addTime(t2);
		System.out.println("Total time  :");
		t3.display();

	}
}