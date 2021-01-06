/* 
 * File name: MyHealthDataTest.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 3
 * Date: December 9 2020
 * Professor: Dave Houtman
 */
import java.util.Scanner;

/**
 * This class is to ask for the user's input to instantiate an object of the class MyHealthData.
 * Then to test methods in the class MyHealthData and call the displayMyHealthData() method to display information of the object.
 * @author Feiqiong Deng
 * @version 1.0
 * @since 1.0
 */
public class MyHealthDataTest {

	/**
	 * This is the main method to use Scanner object to take the input from the users.
	 * Then create an object of the class MyHealthData and instantiate the object with the user's input.
	 * Then call the displayMyHealthData() method to display the object's data. 
	 * @param args--Command line arguments.
	 */
	public static void main(String[] args) {
		
		/**
		 * Create an object of Scanner and takes the parameter of System.in.
		 * Prompts for input of the patient’s data including first name, last name, gender, birth year, current year, height and weight.
		 */
		Scanner input = new Scanner(System.in);  
		System.out.print("Please enter your first name: ");  
		String firstName = input.next();                     
		System.out.print("Please enter your last name: ");
		String lastName = input.next();
		System.out.print("Please enter your gender: ");
		String gender = input.next();
		System.out.print("Please enter your birth year: ");
		int birthYear = input.nextInt();
		System.out.print("Please enter current year: ");
		int currentYear = input.nextInt();
		System.out.print("Please enter your (in inches): ");
		double height = input.nextDouble();
		System.out.print("Please enter your weight(in pounds): ");
		double weight = input.nextDouble();

		/**
		 * Instantiate an object of the class MyHealthData by taking the parameters from all the data input by the user.
		 * This object will be used to call the methods such as MyHealthData() method in the class MyHealthData.
		 */
		MyHealthData myHealthData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		
		/**
		 * Call the displayMyHealthData() method to display all of the information of the object.
		 */
		myHealthData.displayMyHealthData();
		
		/**
		 * Close the scanner.
		 */
	    input.close();
	}
}
