// WAP to find number form the array list !! 
// Linear Search s
import java.util.*;

class Q3{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int n , arr[] , x;

		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();
		System.out.println();
		
		arr = new int [n];

	    for(int i = 0 ; i <arr.length ; i++){
	    	System.out.print("Enter the elment "+ arr[i]+" : ");
	    	arr[i] = sc.nextInt(); 
	    }
	    System.out.println("Enter the number for Search : ");
	    x = sc.nextInt();

	    for(int i =0 ; i < arr.length ; i++){
	    	if(arr[i] == x ){
	    		System.out.println("Found "+x+" at : "+ (i+1));
	    		break;
	    	}
	    	else
	    		System.out.println(x+" Not Found");

	    }

	}
}