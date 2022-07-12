// WAP to Allow the user enter the decimal number and fraction numbers

import java.util.*;
import java.lang.Math;


// Class for String Fraction 
class StringFarction {

	// intitializing the variables 
	String strnum; // String Number 
	int count , number , exp , numerator , denominator ;

	Scanner sc = new Scanner(System.in);

	// Getting the String Number 
	void getStringnumber (){
		System.out.print("Enter the Number as String : ");
		strnum = sc.next();
	}

	// Converting 
	void convert (){
		for(int i=0 ; i< strnum.length();i++){
			if (strnum.charAt(i) == '.'){
				count = strnum.length() - (i+1);
				break;
			}
		}

		number = (int)(Double.parseDouble(strnum) * Math.pow(10,count));

		exp = (int)Math.pow(10,count);

		System.out.println("Number :" + number);

		// Getting the GCD
		int gcd = 1 , flag =0;

		for(int i =2  ; i <= number || i<= exp ;i++){
			for(int j = 2 ; j<i;j++){
				if(i%j==0) flag =1;
			}

			if (flag == 0 && number % i ==0 && exp % i ==0) gcd = gcd*i;
			
			flag =0 ;
		}
		// Actual fraction 
		numerator = number / gcd;
		denominator = exp / gcd ;
		System.out.print("Fraction : "+numerator +"/"+denominator);

	}

}
class Q4{
	public static void main(String [] args){
		
		StringFarction sf = new StringFarction();
		sf.getStringnumber();
		sf.convert();

	}
}