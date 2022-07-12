// WAP to claculate the area of circle , triangle , Square !! 

import java.util.*;
class Q5{
	static void circle(int radius){

		double area = 3.14* radius * radius ;
		System.out.print(area + " is the area of circle !!");

	}
	static void triangle(int height,int base ){
		double area = 0.5 * height * base ;
		System.out.print(area + " is the area of triangle !!") ;
	}
	static void square(int side){
		double area = side * side;
		System.out.print(area + " is the area of square !!");
	}
	public static void main(String [] args ){

		Scanner sc = new Scanner(System.in);
		int ch ;
		int radius, height , base , side;

		System.out.println("Enter the number to select the shape !!");
		System.out.println();
		System.out.println("1 - circle , 2 - triangle , 3 - square ");
		ch = sc.nextInt();

		switch (ch)
		{
		case 1 : 
			System.out.print("Enter the radius : ");
			radius = sc.nextInt();
			circle(radius);
			System.out.println();
			break;
		case 2 : 
			System.out.print("Enter the height and base : ");
			height = sc.nextInt();
			base = sc.nextInt();
			triangle(height , base);
			System.out.println();
			break;
		case 3:
			System.out.print("Enter the side : ");
			side = sc.nextInt();
			square(side);
			System.out.println();
			break;
		}
	}
}