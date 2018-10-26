package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompositeGradeDropLowestGrade {

	@Test
	public void testCompositeGradeAdd1GradeSumAndDrop() {
		Sum theSumStrategy = new Sum();
		theSumStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(0, theGradeList.getValue(), 0);
	}
	
	@Test
	public void testCompositeGradeAddMultipleGradesSumAndDrop() {
		Sum theSumStrategy = new Sum();
		theSumStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(95.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		assertEquals(275, theGradeList.getValue(), 0);
	}
	
	@Test
	public void testCompositeGradeAddMultipleGradesWithZeroSumAndDrop() {
		Sum theSumStrategy = new Sum();
		theSumStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(95.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		SimpleGrade aNewGradeFive = new SimpleGrade(0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		theGradeList.addGradeToCompositeList(aNewGradeFive);
		assertEquals(350, theGradeList.getValue(), 0);
	}
	
	@Test
	public void testCompositeGradeAddMultipleGradesAverageAndDrop() {
		Average theAverageStrategy = new Average();
		theAverageStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(90.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		CompositeGrade theGradeList = new CompositeGrade(theAverageStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		assertEquals(90.0, theGradeList.getValue(), 0);
	}
	
	@Test
	public void testCompositeGradeAddMultipleGradesWithZeroAverageAndDrop() {
		Average theAverageStrategy = new Average();
		theAverageStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(95.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		SimpleGrade aNewGradeFive = new SimpleGrade(0);
		CompositeGrade theGradeList = new CompositeGrade(theAverageStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		theGradeList.addGradeToCompositeList(aNewGradeFive);
		assertEquals(87.5, theGradeList.getValue(), 0);
	}

}
