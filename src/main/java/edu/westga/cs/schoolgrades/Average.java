package edu.westga.cs.schoolgrades;

/**
 * Average Strategy class
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class Average implements Strategy {
	
	private String strategyName;
	private boolean dropLowestGrade;
	
	/**
	 * Initialize the class
	 */
	public Average() {
		this.strategyName = "AVERAGE";
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
