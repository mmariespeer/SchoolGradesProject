package edu.westga.cs.schoolgrades;

/**
 * Simple Grade
 * @author MElissa Speer Osborne
 * @version 10/25/2018
 */
public class SimpleGrade implements Grade {

	private double aSingleGrade;
	
	/**
	 * Initialize a grade from 0 to... extra credit grade
	 * @param aGrade a grade value
	 */
	public SimpleGrade(double aGrade) {
		if (aGrade < 0) {
			throw new IllegalArgumentException("Grade cannot be negative");
		}
		this.aSingleGrade = aGrade; 
	}
	
	@Override
	public double getValue() {
		return this.aSingleGrade;
	}

}
