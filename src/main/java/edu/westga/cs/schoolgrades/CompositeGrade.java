package edu.westga.cs.schoolgrades;

import java.util.ArrayList;
import java.util.Collections;

public class CompositeGrade implements Grade {

	private ArrayList<Grade> gradeList;
	private Strategy theStrategy;
	
	public CompositeGrade(Strategy theStrategy) {
		this.gradeList = new ArrayList<Grade>();
		this.theStrategy = theStrategy;
	}
	
	public void addGradeToCompositeList(Grade aGrade) {
		this.gradeList.add(aGrade);
	}
	
	public ArrayList<Grade> getCompositeGradeList() {
		return this.gradeList;
	}
	
	public Strategy getStrategy() {
		return this.theStrategy;
	}
	
	private void findAndDropLowestGrade() {
		Grade lowestGrade = this.gradeList.get(0);
		for (Grade singleGrade: this.gradeList) {
			if(singleGrade.getValue() < lowestGrade.getValue()) {
				lowestGrade = singleGrade;
			}
		}
		this.gradeList.remove(lowestGrade);
	}

	@Override
	public double getValue() {
		if (this.theStrategy.getStrategyName() == "SUM" && this.theStrategy.getDropLowestGrade() == false) {
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total;
		} else if (this.theStrategy.getStrategyName() == "AVERAGE" && this.theStrategy.getDropLowestGrade() == false) {
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total/this.gradeList.size();
		} else if (this.theStrategy.getStrategyName() == "SUM" && this.theStrategy.getDropLowestGrade() == true) {
			this.findAndDropLowestGrade();
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total;
		} else if (this.theStrategy.getStrategyName() == "AVERAGE" && this.theStrategy.getDropLowestGrade() == true) {
			this.findAndDropLowestGrade();
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total/this.gradeList.size();
		} else {
			return 0;
		}
	} 
}
