package edu.westga.cs.schoolgrades;

public class Average implements Strategy {
	
	private String strategyName;
	
	public Average() {
		this.strategyName = "AVERAGE";
	}

	@Override
	public String getStrategyName() {
		return this.strategyName;
	}

}
