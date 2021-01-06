/* 
 * File name: MyHealthDataTest2.java
 * Author: Feiqiong Deng, 040991296
 * Course: CST8284_303
 * Assignment: Assignment 3
 * Date: December 9 2020
 * Professor: Dave Houtman
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MyHealthDataTest2 {
	private static final double EPSILON = 1E-12;
	
	// This is an object of the class MyHealthData to test all of the get methods for the attributes. 
	MyHealthData getMyData = new MyHealthData("Amy", "Lee", "F", 63.00, 110.00, 1988, 2020);
	
	// This is an object of the class MyHealthData to test all of the set methods for the attributes. 
	MyHealthData setMyData = new MyHealthData("Ben", "Green", "M", 70.00, 170.00, 1990, 2020);

	/**
	 * This is to test the getFirstName() method.
	 * Expected value of the first name is a String type "Amy" which is the first name of the object getMyData.
	 * This method used assertEquals to test whether the given value "Amy" equals the value produced by the getFirstName() method.
	 */
	@Test 
	public void testGetFirstName() {
		String expectedFirstName = "Amy";
		assertEquals(expectedFirstName, getMyData.getFirstName());
	}

	/**
	 * This is to test the setFirstName() method.
	 * Expected value of the first name is a String type "Alan" which updates the first name of the object setMyData.
	 * This method used assertEquals to test whether the given value "Alan" equals the value after using the setFirstName("Alan") method.
	 * setFirstName("Alan") method is used to update the first name to "Alan" and then getFirstName() method used to test whether the value is equal to the expected value.
	 */
	@Test
	public void testSetFirstName() {
		String expectedSetFirstName = "Alan";
		setMyData.setFirstName(expectedSetFirstName);
		assertEquals(expectedSetFirstName, setMyData.getFirstName());
	}

	/**
	 * This is to test the getLastName() method.
	 * Expected value of the first name is a String type "Lee" which is the first name of the object getMyData.
	 * This method used assertEquals to test whether the given value "Lee" equals the value produced by the getLastName() method.
	 */
	@Test
	public void testGetLastName() {
		String expectedLastName = "Lee";
		assertEquals(expectedLastName, getMyData.getLastName());
	}

	/**
	 * This is to test the setLastName() method.
	 * Expected value of the first name is a String type "Blue" which updates the last name of the object setMyData.
	 * This method used assertEquals to test whether the given value "Blue" equals the value after using the setLastName("Blue") method.
	 * setLastName("Blue") method is used to update the last name to "Blue" and then getLastName() method used to test whether the value is equal to the expected value.
	 */
	@Test
	public void testSetLastName() {
		String expectedSetLastName = "Blue";
		setMyData.setLastName(expectedSetLastName);
		assertEquals(expectedSetLastName, setMyData.getLastName());
	}

	/**
	 * This is to test the getGender() method.
	 * Expected value of the first name is a String type "F" which is the gender of the object getMyData.
	 * This method used assertEquals to test whether the given value "F" equals the value produced by the getGender() method.
	 */
	@Test
	public void testGetGender() {
		String expectedGender = "F";
		assertEquals(expectedGender, getMyData.getGender());
	}

	/**
	 * This is to test the setGender() method.
	 * Expected value of the gender is a String type "F" which updates the gender of the object setMyData.
	 * This method used assertEquals to test whether the given value "F" equals the value after using the setGender("F") method.
	 * setGender("F") method is used to update the gender to "F" and then getGender() method used to test whether the value is equal to the expected value.
	 */
	@Test
	public void testSetGender() {
		String expectedSetGender = "F";
		setMyData.setGender(expectedSetGender);
		assertEquals(expectedSetGender, setMyData.getGender());
	}

	/**
	 * This is to test the getBirthYear() method.
	 * Expected value of the birth year is a int type 1988 which is the birth year of the object getMyData.
	 * This method used assertEquals to test whether the given value 1988 equals the value produced by the getBirthYear() method.
	 */
	@Test
	public void testGetBirthYear() {
		int expectedBirthYear = 1988;
		assertEquals(expectedBirthYear, getMyData.getBirthYear());
	}
	
	/**
	 * This is to test the setBirthYear() method.
	 * Expected value of the birth year is a int type 1980 which updates the birth year of the object setMyData.
	 * This method used assertEquals to test whether the given value 1980 equals the value after using the setBirthYear(1980) method.
	 * setBirthYear(1980) method is used to update the birth year to 1980 and then getBirthYear() method used to test whether the value is equal to the expected value.
	 */
	@Test
	public void testSetBirthYear() {
		int expectedSetBirthYear = 1980;
		setMyData.setBirthYear(expectedSetBirthYear);
		assertEquals(expectedSetBirthYear, setMyData.getBirthYear());
	}
	
	/**
	 * This is to test the getCurrentYear() method.
	 * Expected value of the current year is a int type 2020 which is the current year of the object getMyData.
	 * This method used assertEquals to test whether the given value 2020 equals the value produced by the getCurrentYear() method.
	 */
	@Test
	public void testGetCurrentYear() {
		int expectedCurrentYear = 2020;
		assertEquals(expectedCurrentYear, getMyData.getCurrentYear());
	}

	/**
	 * This is to test the setCurrentYear() method.
	 * Expected value of the current year is a int type 2021 which updates the current year of the object setMyData.
	 * This method used assertEquals to test whether the given value 2021 equals the value after using the setCurrentYear(2021) method.
	 * setCurrentYear(2021) method is used to update the birth year to 2021 and then getCurrentYear() method used to test whether the value is equal to the expected value.
	 */
	@Test
	public void testSetCurrentYear() {
		int expectedSetCurrentYear = 2021;
		setMyData.setCurrentYear(expectedSetCurrentYear);
		assertEquals(expectedSetCurrentYear, setMyData.getCurrentYear());
	}

	/**
	 * This is to test the getHeight() method.
	 * Expected value of the height is a double type 63.00 which is the height of the object getMyData.
	 * This method used assertEquals to test whether the given value 63.00 equals the value produced by the getHeight() method.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testGetHeight() {
		double expectedHeight = 63.00;
		assertEquals(expectedHeight, getMyData.getHeight(), EPSILON);		
	}

	/**
	 * This is to test the setHeight() method.
	 * Expected value of the height is a double type 80.00 which updates the height of the object setMyData.
	 * This method used assertEquals to test whether the given value 80.00 equals the value after using the setHeight(80.00) method.
	 * setHeight(80.00) method is used to update the height to 80.00 and then getHeight() method used to test whether the value is equal to the expected value.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testSetHeight() {
		double expectedSetHeight = 80.00;
		setMyData.setHeight(expectedSetHeight);
		assertEquals(expectedSetHeight, setMyData.getHeight(), EPSILON);
	}

	/**
	 * This is to test the getWeight() method.
	 * Expected value of the height is a double type 110.00 which is the weight of the object getMyData.
	 * This method used assertEquals to test whether the given value 110.00 equals the value produced by the getWeight() method.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testGetWeight() {
		double expectedWeight = 110.00;
		assertEquals(expectedWeight, getMyData.getWeight(), EPSILON);		
	}

	/**
	 * This is to test the getWeight() method.
	 * Expected value of the weight is a double type 100.00 which updates the height of the object setMyData.
	 * This method used assertEquals to test whether the given value 100.00 equals the value after using the setWeight(100.00) method.
	 * setWeight(100.00) method is used to update the weight to 100.00 and then getWeight() method used to test whether the value is equal to the expected value.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testSetWeight() {
		double expectedSetWeight = 100.00;
		setMyData.setWeight(expectedSetWeight);
		assertEquals(expectedSetWeight, setMyData.getWeight(), EPSILON);
	}

	/**
	 * This is to test the getAge() method.
	 * Expected value of the age is an int type 32  which is the age of the object getMyData.
	 * This method used assertEquals to test whether the given value 32 equals the value produced by the getAge() method.
	 */
	@Test
	public void testGetAge() {
		int expectedAge = 32;
		assertEquals(expectedAge, getMyData.getAge());
	}

	/**
	 * This is to test the getMaximumHeartRate() method.
	 * Expected value of the age is an int type 188  which is the maximum heart rate of the object getMyData.
	 * This method used assertEquals to test whether the given value 188 equals the value produced by the getMaximumHeartRate() method.
	 */
	@Test 
	public void testGetMaximumHeartRate() {
		int expectedMaximumHeartRate = 188;
		assertEquals(expectedMaximumHeartRate, getMyData.getMaximumHeartRate());
	}

	/**
	 * This is to test the getMinimumTargetHeartRate() method.
	 * Expected value of the age is an double type 94.00  which is the minimum target heart rate of the object getMyData.
	 * This method used assertEquals to test whether the given value 94.00 equals the value produced by the getMinimumTargetHeartRate() method.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testGetMinimumTargetHeartRate() {
		double expectedMinimum = 94.00;
		assertEquals(expectedMinimum, getMyData.getMinimumTargetHeartRate(), EPSILON);
	}

	/**
	 * This is to test the getMaximumTargetHeartRate() method.
	 * Expected value of the age is an double type 159.80 which is the maximum target heart rate of the object getMyData.
	 * This method used assertEquals to test whether the given value 159.80 equals the value produced by the getMaximumTargetHeartRate() method.
	 * EPSILON is used to indicate precision when comparing the double expected and double actual values.
	 */
	@Test
	public void testGetMaximumTargetHeartRate() {
		double expectedMaximum = 159.80;
		assertEquals(expectedMaximum, getMyData.getMaximumTargetHeartRate(), EPSILON);		
	}

	/**
	 * This is to test the getBMI() method.
	 * Expected value of the BMI is an double type 19.48 which is the BMI of the object getMyData.
	 * This method used assertEquals to test whether the given value 19.48 equals the value produced by the getBMI() method.
	 * As the expected BMI and value from getBMI() method are rounded to two decimals, 0.01 is used to indicate the accuracy of your comparison.
	 */
	@Test
	public void testGetBMI() {
		double expectedBMI = 19.48;
		assertEquals(expectedBMI, getMyData.getBMI(), 0.01);		
	}
}
