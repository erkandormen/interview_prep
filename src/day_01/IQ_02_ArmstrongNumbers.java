package day_01;

import java.util.Scanner;

public class IQ_02_ArmstrongNumbers {

	public static void main(String[] args) {
		/*
  	A number is called an Armstrong number if it equals to the sum of 
 	the cube of its every digit.
    
    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, 
    which is equal to 1^3+5^3+3^3.
    You need to write a program to check if the given number is an Armstrong number 
    or not.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is an Armstrong number or not");

		int n=scan.nextInt();
		int sumOfCubes=0;
		int temp=n;
		int digit=0;
		
		while (temp>0) {
			digit=temp%10;//3 //5 //1
//			sumOfCubes= sumOfCubes+digit*digit*digit;
			sumOfCubes+=(int) Math.pow(digit, 3);
			temp=temp/10;
		}
		
		if(n==sumOfCubes) {
			System.out.println(n+" is an Armstrong number");
		}else {
			System.out.println(n+" is not an Armstrong number");
		}
		
		
	}

}
