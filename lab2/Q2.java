// WAP to find area of circle 


import java.util.*;
class Q2{
	public static void main(String [] args){
		double radius ;
		double area ;

		Scanner r = new Scanner(System.in);
		System.out.println();

		System.out.print("Enter the radius : ");
		radius = r.nextInt();

		area = Math.PI*radius*radius;

		System.out.println("Area of Circle is :"+area);


	}
}
