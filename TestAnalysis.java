/* 
 * File name: Student.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 1
 * Date: October 24 2020
 * Professor: Dave Houtman
 */
package assignment1;

import java.util.Scanner;

/**
 * To test the class Analysis.
 * @author Feiqiong Deng
 * @version 1.0
 * @see assignment1
 */
public class TestAnalysis {
	
	/**
	 * The main method to get complex numbers as input and do computation.
	 * @param args --Command line arguments.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the real part of the first complex number: ");
		float r1 = input.nextFloat();
		
		System.out.print("Enter the imaginary part of the first complex number: ");
		float i1 = input.nextFloat();	
		
		System.out.print("Enter the real part of the second complex number: ");
		float r2 = input.nextFloat();
		
		System.out.print("Enter the imaginary part of the second complex number: ");
		float i2 = input.nextFloat();
		
		Analysis a1 = new Analysis(r1, i1);
		Analysis a2 = new Analysis(r2, i2);
		
		System.out.println("Press 1: substract these two numbers");
		System.out.println("Press 2: add these two numbers");
		int choice = input.nextInt();
 
		if (choice == 1) {
			a1.minus(a2);
			System.out.print("After computation, the result is: " );
			a1.printing();
		} else if (choice == 2) {
			a1.plus(a2);
			System.out.print("After computation, the result is: " ); 
			a1.printing();
		} else {
			System.out.println("Please run the program again.");
		}
	}
}
