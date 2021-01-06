/* 
 * File name: MyHealthData.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 3
 * Date: December 9 2020
 * Professor: Dave Houtman
 */

/**
 * This is a MyHealthData class to set all of the attributes and methods including set, get methods for all private attributes, and display methods. 
 * @author Feiqiong DENG
 * @version 1.0
 * @since 1.0
 */
public class MyHealthData {
	
	/**
	 * firstName is the firstName of the object. 
	 * lastName is the lastName of the object. 
	 * gender is the gender of the object.
	 * birthYear is the year of birth of the object.
	 * currentYear is the current year of the object.
	 * height is the height of the object.
	 * weight is the weight of the object.
	 */
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;

	/**
	 * This is a constructor of receiving parameters of firstName, lastName, gender, height, weight, birthYear and currentYear.
	 * @param firstName The firstName is a parameter of type String.  
	 * @param lastName The lastName is a parameter of type String.  
	 * @param gender The gender is a parameter of type String.  
	 * @param height The height is a parameter of type double.
	 * @param weight The weight is a parameter of type double.
	 * @param birthYear The birthYear is a parameter of type int.
	 * @param currentYear The currentYear is a parameter of type int.
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;		
	}
	
	/**
	 * This method is a public get method to provide access to the firstName of the MyHealthData object outside class.
	 * As the firstName is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The first name of the object MyHealthData need to be retrieved and displayed, so the get method of the firstName is required. 
	 * @return firstName --The type String of first name of the object MyHealthData.
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * This method is a public void set method to take a parameter of String type and assigns it to the firstName attribute.
	 * This method can provide access to the private attribute of firstName outside the class and update the first name of the object.
	 * @param firstName --A parameter of type String.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * This method is a public get method to provide access to the lastName of the MyHealthData object outside class.
	 * As the lastName is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The last name of the object MyHealthData need to be retrieved and displayed, so the get method of the lastName is required. 
	 * @return lastName --The type String of the last name of the object MyHealthData.
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * This method is a public void set method to take a parameter of String type and assigns it to the lastName attribute.
	 * This method can provide access to the private attribute of lastName outside the class and update the last name of the object.
	 * @param lastName --A parameter of type String.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * This method is a public get method to provide access to the gender of the MyHealthData object outside class.
	 * As the gender is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The gender of the object MyHealthData need to be retrieved and displayed, so the get method of the gender is required. 
	 * @return gender --The type String of the gender of the object MyHealthData.
	 */
	public String getGender() {
		return this.gender;
	}
	
	/**
	 * This method is a public void set method to take a parameter of String type and assigns it to the gender attribute.
	 * This method can provide access to the private attribute of gender outside the class and update the gender of the object.
	 * @param gender --A parameter of type String.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * This method is a public get method to provide access to the birth year of the MyHealthData object outside class.
	 * As the birth year is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The birth year of the object MyHealthData need to be retrieved and displayed, so the get method of the birth year is required. 
	 * @return birthYear --The type int of the birth year of the object MyHealthData.
	 */
	public int getBirthYear() {
		return this.birthYear;
	}
	
	/**
	 * This method is a public void set method to take a parameter of int type and assigns it to the birth year attribute.
	 * This method can provide access to the private attribute of birth year outside the class and update the birth year of the object.
	 * @param birthYear --A parameter of type int.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * This method is a public get method to provide access to the current year of the MyHealthData object outside class.
	 * As the current year is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The current year of the object MyHealthData need to be retrieved and displayed, so the get method of the current year is required. 
	 * @return currentYear --The type int of the current year of the object MyHealthData.
	 */
	public int getCurrentYear() {
		return this.currentYear;
	}
	
	/**
	 * This method is a public void set method to take a parameter of int type and assigns it to the current year attribute.
	 * This method can provide access to the private attribute of current year outside the class and update the current year of the object.
	 * @param currentYear --A parameter of type int.
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;		
	}
	
	/**
	 * This method is a public get method to provide access to the height of the MyHealthData object outside class.
	 * As the height is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The height of the object MyHealthData need to be retrieved and displayed, so the get method of the height is required. 
	 * @return height --The type double of the height of the object MyHealthData.
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * This method is a public void set method to take a parameter of double type and assigns it to the height attribute.
	 * This method can provide access to the private attribute of height outside the class and update the height of the object.
	 * @param height --A parameter of type double.
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * This method is a public get method to provide access to the weight of the MyHealthData object outside class.
	 * As the weight is a private attribute, if there is no public get method of it, it can only be accessed within this class.
	 * The weight of the object MyHealthData need to be retrieved and displayed, so the get method of the weight is required.
	 * @return weight --The type double of the weight of the object MyHealthData.
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * This method is a public void set method to take a parameter of double type and assigns it to the weight attribute.
	 * This method can provide access to the private attribute of weight outside the class and update the weight of the object.
	 * @param weight --A parameter of type double.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * This method is to calculate the age of the object. It takes no parameter. 
	 * This method uses the object's attribute, the current year, subtracts another object's attribute, birth year.
	 * @return age --It is the type int and it is the age of the object.
	 */
	public int getAge() {		
		return this.currentYear - this.birthYear;
	}
	
	/**
	 * This method is to calculate maximum heart rate of the object.
	 * This method invokes the getAge() method to get the object's age, and then subtracts the age from 220.
	 * @return MaximumHeartRate --It is the type int and it is the maximum heart rate of the object.
	 */
	public int getMaximumHeartRate() {
		return 220 - getAge();

	}
	
	/**
	 * This method is to calculate minimum target heart rate of the object.
	 * This method invokes getMaximumHeartRate() method to get the maximum heart rate, and then times 0.5. 
	 * @return minimumTargetHeartRate --The type double and it is the minimum target heart rate of the object.
	 */
	public double getMinimumTargetHeartRate() {
		return getMaximumHeartRate() * 0.5;
	}
	
	/**
	 * This method is to calculate maximum target heart rate of the object.
	 * This method invokes getMaximumHeartRate() method to get the maximum heart rate, and then times 0.85. 
	 * @return maximumTargetHeartRate --It is the type double and it is the maximum target heart rate of the object.
	 */
	public double getMaximumTargetHeartRate() {
		return getMaximumHeartRate() * 0.85;
	}

	/**
	 * THIS RETURNS THE PATIENT'S Body Mass Index (BMI).
	 * This method invokes getWeight() method to get the object's weight and getHeight() method to get the object's height.
	 * Then the weight times 703, and then the product is divided by the height to the power 2. 
	 * @return BMI --It is the type double and it is BMI of the object.
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	/**
	 * This method is a public void method to display information of the object.
	 * This method invokes all of the get methods of this class to prints the all of the object's attributes and age, BMI, maximum heart rate, maximum target heart rate and  minimum target heart rate. 
	 * This method also displays the BMI values.
	 */
	public void displayMyHealthData() { 
	   System.out.printf("\nYOUR HEALTH DATA\nFirst name: %s\nLast name: %s\nGender: %s\nBirth year: %d\nHeight: %.2f inches\nWeight: %.2f pounds\nAge: %d\n"
	   		+ "BMI: %.2f\nMmaximum heart rate: %d\nTarget heart rate range (MinimumHeartRate and MaximumHeartRate): %.2f and %.2f\n\n",
	   		getFirstName(), getLastName(), getGender(), getBirthYear(), getHeight(), getWeight(), getAge(), getBMI(), getMaximumHeartRate(), 
	   		getMinimumTargetHeartRate(), getMaximumTargetHeartRate());
	   
	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 
}



