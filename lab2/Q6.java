// WAP to calculate BMI(Body Mass Index)

import java.util.*;

class Q6{
	public static void main (String [] args ){

		System.out.println();
		System.out.print("<------Program for BMI------>");
		System.out.println();
		System.out.println();

		double pound , inch;

		Scanner sc = new Scanner(System.in);

		System.out.print("Weigth in pound : ");
		pound = sc.nextDouble();

		System.out.println();

		System.out.print("Height in inch : ");
		inch = sc.nextDouble();

		System.out.println();

		double kg = pound / 0.45359237;
		double meter = inch / 0.0254;

		double bmi = kg / meter*meter;

		System.out.print("BMI : "+ bmi);
		System.out.println();

	}
}