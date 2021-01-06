/* 
 * File name: Student.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 1
 * Date: October 24 2020
 * Professor: Dave Houtman
 */
package assignment1;

/**
 * This is a class to carry out computations on complex numbers
 * @author Feiqiong Deng
 * @version 1.0
 * @see assignment1 
 */
public class Analysis {
	
	/**
	 * The real part of a complex number.
	 */
	private float real;
	
	/**
	 * The imaginary part of a complex number.
	 */
	private float imaginary;
	
	/**
	 * A class constructor of two parameters.
	 * @param real The real part of a complex number
	 * @param imaginary The imaginary part of a complex number.
	 */
	public Analysis(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;	
	}
	
	/**
	 * A no-argument constructor. 
	 */
	public Analysis() {
		this.real = 0.0f;
		this.imaginary = 0.0f;
	}
	
	/**
	 * The method of subtraction of two complex numbers.
	 * @param b An Analysis object.
	 * @return A complex number after subtraction of real parts and imaginary parts.
	 */
	public Analysis minus(Analysis b) {
		this.real -= b.real;
		this.imaginary -= b.imaginary;
		return this;
	}
	
	/**
	 * The method of addition of two complex numbers.
	 * @param b An Analysis object.
	 * @return A complex number after addition of real parts and imaginary parts.
	 */
	public Analysis plus(Analysis b) {
		this.real += b.real;
		this.imaginary += b.imaginary;
		return this;
	}
	
	/**
	 * The method of printing the result after computation.
	 */
	public void printing() {
		System.out.println(this.real + " + " + this.imaginary + "i.");
		System.out.println("The real part is " + this.real + "; the imaginary part is " + this.imaginary + "i");
	}

}
