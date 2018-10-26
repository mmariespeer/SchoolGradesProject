package edu.westga.cs.schoolgrades;

import java.util.ArrayList;

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

	@Override
	public double getValue() {
		return 0;
	} 
}
