package edu.westga.cs.schoolgrades;

public class Sum implements Strategy {
	
	private String strategyName;
	private boolean dropLowestGrade;
	
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
