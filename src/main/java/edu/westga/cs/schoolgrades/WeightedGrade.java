package edu.westga.cs.schoolgrades;

public class WeightedGrade implements Grade {
	
	private double aSingleWeightedGrade;
	
	public WeightedGrade(double aGrade, double aWeight) {
		if(aGrade < 0) {
			throw new IllegalArgumentException("Grade cannot be negative");
		}
		
		if(aWeight < 0 || aWeight > 1) {
			throw new IllegalArgumentException("Weight must be a decimal value between 0 and 1");
		}
		this.aSingleWeightedGrade = aGrade * aWeight; 
	}

	@Override
	public double getValue() {
		return this.aSingleWeightedGrade;
	}

}
