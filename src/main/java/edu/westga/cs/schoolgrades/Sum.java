package edu.westga.cs.schoolgrades;

/**
 * Sum strategy class
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class Sum implements Strategy {
	
	private String strategyName;
	private boolean dropLowestGrade;
	
	/**
	 * Initialize class variables
	 */
	public Sum() {
		this.strategyName = "SUM";
		this.dropLowestGrade = false;
	}

	@Override
	public String getStrategyName() {
		return this.strategyName;
	}

	@Override
	public boolean getDropLowestGrade() {
		return this.dropLowestGrade;
	}

	@Override
	public void setDropLowestGrade(boolean dropGrade) {
		this.dropLowestGrade = dropGrade;
	}

}
