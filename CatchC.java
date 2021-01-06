/* 
 * File name: CatchC.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 2
 * Date: December 2 2020
 * Professor: Dave Houtman
 */

/**
 * This is CatchC class with main method to show re-throwing of an exception.
 * @author Feiqiong Deng
 * @version 1.0
 * @since 1.0
 */
public class CatchC {
	
	/**
	 * This method is created to initially throw an error of type Exception.
	 * @throws Exception The error thrown is a type of Exception.
	 * When this method is called, a message will be printed and an Exception type will be thrown.
	 */
	public static void holidayEnding() throws Exception {
		System.out.println("Exception in holidayEnding() method.");
		throw new Exception("Exception in holidayEnding() method occurred.");
	}
	
	/**
	 * This method is created to catch the Exception and re-throw it. 
	 * @throws The error thrown is a type of Exception.
	 * The try block in this method is to call the holidayEnding, so the Exception is thrown.
	 * The catch block in this method is to catch the Exception and to print out a message.
	 * The Exception is then re-thrown in this method.
	 */
	public static void holidayStarting() throws Exception {
		try {
			holidayEnding();
		} catch(Exception e) {
			System.out.println("Exception in holidayStarting() method.");
			throw e;
		}		
	}
    
	/**
	 * This is the main method to call the method holidayStarting(), and catch the re-thrown exception.
	 * @param args--Command line arguments.
	 */
	public static void main(String[] args) {
		
		/**
		 * The try block is to call the method holidayStarting().
		 * The holidayEnding() method is invoked in the holidayStarting() method.
		 * Then the Exception is thrown and caught in the catch block in the holidayStarting() method and will be thrown again.
		 * The catch block in the main method will finally handle the re-thrown Exception and print out a message and stack trace.
		 */
		try {
			holidayStarting();
		} catch (Exception e) {
			System.out.println("Exception caught in the main.");
		    e.printStackTrace();  
		}
	}	
}
