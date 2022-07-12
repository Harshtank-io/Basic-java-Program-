// WAP for simple calculater using java

import java.util.*;

class Q6{
	public static void main(String [] args){

		System.out.println();
		System.out.print("<-----Program for simple calculater using switch----->");
		System.out.println();
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number-1 : ");
		double num1 = sc.nextDouble();
		System.out.println();

		System.out.print("Enter number-2 : ");
		double num2 = sc.nextDouble();
		System.out.println();

		System.out.print("Enter Operation ( + , -, *, / ) : ");
		char ch = sc.next().charAt(0);
		System.out.println();

      	double result=0;

		switch(ch){

		case '+':
			result = num1 + num2;
			break;

        case '-':
			result = num1 - num2;
			break;
		
		case '*':
			result = num1 * num2;
			break;
			

		case '/':
			result = num1 / num2;
			break;
				
		}

		System.out.println("Result : "+ result);
	}
}