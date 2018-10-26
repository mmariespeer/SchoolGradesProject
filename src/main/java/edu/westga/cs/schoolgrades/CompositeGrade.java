package edu.westga.cs.schoolgrades;

import java.util.ArrayList;

/**
 * Composite class for a basic grade
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class CompositeGrade implements Grade {

	private ArrayList<Grade> gradeList;
	private Strategy theStrategy;
	
	/**
	 * Initialize class variables
	 * @param theStrategy a Strategy
	 */
	public CompositeGrade(Strategy theStrategy) {
		this.gradeList = new ArrayList<Grade>();
		this.theStrategy = theStrategy;
	}
	
	/**
	 * Add a grade to the list
	 * @param aGrade a Grade
	 */
	public void addGradeToCompositeList(Grade aGrade) {
		this.gradeList.add(aGrade);
	}
	
	/**
	 * Get the list of grades
	 * @return the list of grade objects
	 */
	public ArrayList<Grade> getCompositeGradeList() {
		return this.gradeList;
	}
	
	/**
	 * Return the strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return this.theStrategy;
	}
	
	private void findAndDropLowestGrade() {
		Grade lowestGrade = this.gradeList.get(0);
		for (Grade singleGrade: this.gradeList) {
			if (singleGrade.getValue() < lowestGrade.getValue()) {
				lowestGrade = singleGrade;
			}
		}
		this.gradeList.remove(lowestGrade);
	}

	@Override
	public double getValue() {
		if ("SUM".equals(this.theStrategy.getStrategyName()) && !this.theStrategy.getDropLowestGrade()) {
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total;
		} else if ("AVERAGE".equals(this.theStrategy.getStrategyName()) && !this.theStrategy.getDropLowestGrade()) {
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total / this.gradeList.size();
		} else if ("SUM".equals(this.theStrategy.getStrategyName()) && this.theStrategy.getDropLowestGrade()) {
			this.findAndDropLowestGrade();
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total;
		} else if ("AVERAGE".equals(this.theStrategy.getStrategyName()) && this.theStrategy.getDropLowestGrade()) {
			this.findAndDropLowestGrade();
			double total = 0;
			for (Grade singleGrade: this.gradeList) {
				total += singleGrade.getValue();
			}
			return total / this.gradeList.size();
		} else {
			return 0;
		}
	} 
}
