/* 
 * File name: CatchA.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 2
 * Date: December 2 2020
 * Professor: Dave Houtman
 */

/**
 * This is CatchA class with main method to show Exception handling and inheritance hierarchy.
 * @author Feiqiong Deng
 * @version 1.0
 * @since 1.0
 */
public class CatchA {
	
	/**
	 * ExceptionOne is declared as an inner class of CatchA, and it extends from Exception.
	 * It is declared static so that ExceptionOne can be accessed without creating an object of its outer class CatchA. 
	 */
	static class ExceptionOne extends Exception {
	}

	/**
	 * ExceptionTwo is declared as an inner class of CatchA, and it extends from ExceptionOne.
	 * It is declared static so that ExceptionTwo can be accessed without creating an object of its outer class CatchA.
	 * ExceptionTwo is also a type of Exception as its parent class ExceptionOne is a subclass of Exception.
	 */
	static class ExceptionTwo extends ExceptionOne {
	}

	/**
	 * ExceptionThree is declared as an inner class of CatchA, and it extends from ExceptionTwo.
	 * It is declared static so that ExceptionThree can be accessed without creating an object of its outer class CatchA.
	 * ExceptionThree is also a type of ExceptionOne as its parent class ExceptionTwo is a child class of ExceptionOne.
	 */
	static class ExceptionThree extends ExceptionTwo {
	}

	/**
	 * This is the main method to show the Exception handling in hierarchy of inheritance of ExceptionOne, ExceptionTwo and ExceptionThree.
	 * @param args--Command line arguments.
	 */
	public static void main(String[] args) {
		
		/**
		 * This is a try and catch block to show the exception ExceptionTwo will be caught in the catch block of type ExceptionOne.
		 * In the try block, an object of ExceptionTwo is thrown.
		 * The first catch block handles the type ExceptionOne and execute codes to print out an error message and stack trace.
		 * The first catch block will handle ExceptionTwo because ExceptionOne is superclass and can catch all objects of its subclasses.
		 * The catch block to handle type ExceptionTwo is not written because it is a subclass of ExceptionOne, and if it was written, the ExceptionTwo would execute and catch block of ExceptionOne would not.
		 * The second catch block handles the type Exception. It is not invoked as the ExceptionTwo is already caught in the catch block of type ExceptionOne.
		 */
		try {
			throw new CatchA.ExceptionTwo();
		} catch(ExceptionOne e) {
			System.err.println("ExceptionTwo occurred.");
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("Exception occurred");
			e.printStackTrace();
		}
		
		/**
		 * This is a try and catch block to show the exception ExceptionThree will be caught in the catch block of type ExceptionOne.
		 * In the try block, an object of ExceptionThree is thrown.
		 * The first catch block handles the type ExceptionOne and execute codes to print out an error message and stack trace.
		 * The first catch block will handle ExceptionThree because ExceptionOne is superclass and can catch all objects of its subclasses.
		 * The catch block to handle type ExceptionThree is not written because it is a subclass of ExceptionOne, and if it was written, the ExceptionThree would execute and catch block of ExceptionOne would not.
		 * The second catch block handles the type Exception. It is not invoked as the ExceptionThree is caught in the catch block of type ExceptionOne.
		 */
		try {
			throw new CatchA.ExceptionThree();
		} catch(ExceptionOne e) {
			System.err.println("ExceptionThree occurred.");
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println("Exception occurred");
			e.printStackTrace();
		}
	}	
}



