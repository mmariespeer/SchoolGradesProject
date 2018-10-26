package edu.westga.cs.schoolgrades;

public class Sum implements Strategy {
	
	private String strategyName;
	
	public Sum() {
		this.strategyName = "SUM";
	}

	@Override
	public String getStrategyName() {
		return this.strategyName;
	}


}
