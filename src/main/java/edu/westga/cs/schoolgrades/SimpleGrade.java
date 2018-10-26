package edu.westga.cs.schoolgrades;

public class SimpleGrade implements Grade {

	private double aSingleGrade;
	
	public SimpleGrade(double aGrade) {
		if(aGrade < 0) {
			throw new IllegalArgumentException("Grade cannot be negative");
		}
		this.aSingleGrade = aGrade; 
	}
	
	@Override
	public double getValue() {
		return this.aSingleGrade;
	}

}
