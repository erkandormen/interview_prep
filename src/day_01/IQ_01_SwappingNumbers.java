package day_01;

import java.util.Scanner;

public class IQ_01_SwappingNumbers {

	public static void main(String[] args) {
/*
 * 	 * Example:
		 * Enter 2 numbers to swap
			12
			66
			Before swapping: 12.0 - 66.0
			After swapping: 66.0 - 12.0
 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1= scan.nextDouble();
		double n2= scan.nextDouble();
		
		System.out.println("Before swapping: "+n1+" "+n2);
//		//1st way temp variable
//		double temp = n1;
//		n1=n2;
//		n2=temp;
		
		//Assume that input n1=10; n2=20
		//2nd way matematic operations
		n1=n1+n2;//10+20=30->n1
		n2=n1-n2;//30-20=10->n2
		n1=n1-n2;//30-10=20->n1
		
		System.out.println("After swapping: "+n1+" "+n2);
	}

}
