// WAP for CLASS of circle and write the area and perimeter Functions 

import java.util.*;

class Circle {

	// method finding the area 
	public void area(double r ){

		double area = Math.PI * r * r;

		System.out.print("Area: "+area);
	}

	public void perimeter(double r){

		double peri = 2*(Math.PI)*r;

		System.out.println();
		System.out.print("perimeter : "+peri);


	}
}

class Q1{

	public static void main(String [] args ){

		Scanner sc = new Scanner(System.in);

		// getting the radius 
		double r;

		System.out.print("Enter the radius : ");
		r = sc.nextDouble();

		// Calling the methods and class 

		Circle c = new Circle();

		c.area(r);
		c.perimeter(r);

	}
}