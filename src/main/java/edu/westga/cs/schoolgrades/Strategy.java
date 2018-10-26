package edu.westga.cs.schoolgrades;

/**
 * Strategy Interface
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public interface Strategy {
	
	/**
	 * get strategy name
	 * @return the name of the strategy
	 */
	String getStrategyName();
	
	/**
	 * Return whether or not to drop the lowest grade
	 * @return as a boolean
	 */
	boolean getDropLowestGrade();
	
	/**
	 * Set whether or not to drop the lowest grade
	 * @param dropGrade as a boolean
	 */
	void setDropLowestGrade(boolean dropGrade);

}
