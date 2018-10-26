package edu.westga.cs.schoolgrades;

public interface Strategy {
	
	public String getStrategyName();
	
	public boolean getDropLowestGrade();
	
	public void setDropLowestGrade(boolean dropGrade);

}
