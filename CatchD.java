/* 
 * File name: CatchD.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 2
 * Date: December 2 2020
 * Professor: Dave Houtman
 */

import java.io.*;

/**
 * This is CatchD class with main method to show the importance of the catch blocks order.
 * @author Feiqiong Deng
 * @version 1.0
 * @since 1.0
 */
public class CatchD {

	/**
	 * This is the main method to show a compilation error when the catch blocks are incorrect.
	 * @param args--Command line arguments.
	 */
	public static void main(String[] args) {
		
		Exception exception = new Exception();        // An object of the superclass Exception is created. 
		IOException ioException = new IOException();  // An object of the subclass IOException is created. 
		
		/**
		 * In this try block, the object of IOException is thrown.
		 * The catch block handling the type Exception which is a superclass is written firstly.
		 * The catch block handling the type IOException which is a subclass is written secondly.
		 * As the ioException is a subclass of Exception, it will be caught in the first catch block because IOException is also a type of Exception.
		 * Thus, the second catch block handling a more specific IOException is unreachable so as to cause a compilation error.
		 */
		try {
			throw ioException;		
		} catch (Exception e) {
			System.out.println("Exception occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occurred.");
			e.printStackTrace();
		}
		
		/**
		 * In this try block, the object of Exception is thrown.
		 * In the catch block, the block of handling IOException which is a subclass of Exception is written firstly.
		 * The second block handles the superclass type Exception.
		 * The subclass IOException cannot handle the type Exception, but Exception will can be caught when it reaches at the second catch block.
		 * The order of writing the catch block of a more specific exception before that of a more general exception will not cause a compilation error.
		 */
		try {
			throw exception;		
		} catch (IOException e) {
			System.out.println("Exception occurred.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("IOException occurred.");
			e.printStackTrace();
		}			
	}
}
