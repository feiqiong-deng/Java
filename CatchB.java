/* 
 * File name: CatchB.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 2
 * Date: December 2 2020
 * Professor: Dave Houtman
 */

import java.io.*;

/**
 * This is CatchB class with main method to demonstrates the use of the try catch block.
 * @author Feiqiong Deng
 * @version 1.0
 * @since 1.0
 */
public class CatchB {
	
	/**
	 * ExceptionFour is declared as an inner class of CatchB, and it extends Exception.
	 * Class Exception is the super class of class ExceptionFour.
	 * It is declared static so that ExceptionFour can be accessed without creating an object of its outer class CatchB. 
	 */
	static class ExceptionFour extends Exception {	
	}
	
	/**
	 * ExceptionFive is declared as an inner class of CatchB, and it extends ExceptionFour.
	 * Class ExceptionFour is the parent class of class ExceptionFive.
	 * ExceptionFive is also a subclass of Exception.
	 * It is declared static so that ExceptionFive can be accessed without creating an object of its outer class CatchB. 
	 */
	static class ExceptionFive extends ExceptionFour {
	}

	/**
	 * This is the main method to show Exception handling in try catch block to handle different types of exceptions.
	 * @param args--Command line arguments.
	 */
	public static void main(String[] args) {
		
		/**
		 * This is a try and catch block to show the exception ExceptionFour will be caught in the catch block of its corresponding exception type.
		 * In the try block, an object of ExceptionFour is thrown.
		 * The first catch block handles the type ExceptionFour and execute codes to print out a message and stack trace.
		 * As the ExceptionFour is thrown in the try block, the first catch block will execute and handle ExceptionFour.
		 * The second catch block handles the type Exception. It will not execute as the ExceptionFour is caught in the catch block of type ExceptionFour.
		 */
		try {
			throw new CatchB.ExceptionFour();
		} catch(ExceptionFour e) {
			System.out.println("ExceptionFour occurred.");
		    e.printStackTrace();  
		} catch(Exception e) {
			System.out.println("Exception occurred.");
			e.printStackTrace();  
		}
		
		/**
		 * This is a try and catch block to show the exception ExceptionFive will be caught in the catch block of its corresponding exception type.
		 * In the try block, an object of ExceptionFive is thrown.
		 * The first catch block handles the type ExceptionFive and execute codes to print out a message and stack trace.
		 * As the ExceptionFive is thrown in the try block, the first catch block will execute and handle ExceptionFive.
		 * The second catch block handles the type Exception. It will not execute as the ExceptionFive is caught in the catch block of type ExceptionFive.
		 */
		try {
			throw new CatchB.ExceptionFive();
		} catch(ExceptionFive e) {
			System.out.println("ExceptionFive occurred.");
		    e.printStackTrace(); 
		} catch(Exception e) {
			System.out.println("Exception occurred.");	
		    e.printStackTrace();  
		}
		
		/**
		 * This is a try and catch block to show the exception NullPointerException will be caught in the catch block of its corresponding exception type.
		 * In the try block, an integer array is declared null, but the index 0 of the array is then set to be 1. This makes NullPointerException occur.
		 * The first catch block is written to handle the type NullPointerException and execute codes to print out a message and stack trace.
		 * The NullPointerException is caught in the first catch block.
		 * The second catch block handles the type Exception. It will not execute as the NullPointerException is already caught in the first catch block.
		 */
		try {
			int array[] = null;
			array[0] = 1;
		} catch(NullPointerException e) {
			System.out.println("NullPointerException occurred.");
		    e.printStackTrace();  
		} catch(Exception e) {
			System.out.println("Exception occurred.");
		    e.printStackTrace();  
		}
		
		/**
		 * This is a try and catch block to show the exception IOException will be caught in the catch block of its corresponding exception type.
		 * In the try block, objects of the File class and FileInputStream are created.
		 * The FileInputStream object tries to read the file test.txt from the file system.
		 * The file test.txt is not in the correct path, so FileNotFoundException which is a subclass of IOException will be thrown.
		 * The first catch block is written to handle the type IOException and execute codes to print out a message and stack trace.
		 * The IOException handles the FileNotFoundException which is a subclass of IOException.
		 * The second catch block handles the type Exception. It will not execute as the IOException is already caught in the first catch block.
		 */
		try {
	        File file = new File("test.txt");
	        FileInputStream fileInputStream = null;
	        fileInputStream = new FileInputStream(file);
			fileInputStream.read();
			fileInputStream.close(); // close file input stream
		} catch(IOException e) {
			System.out.println("IOException occurred.");	
            e.printStackTrace();
        } catch(Exception e) {
			System.out.println("Exception occurred.");
		    e.printStackTrace();  
		}
	}
}
