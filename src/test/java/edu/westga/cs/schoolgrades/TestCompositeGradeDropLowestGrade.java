package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Drop lowest grade
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class TestCompositeGradeDropLowestGrade {

	/**
	 * Drop lowest grade with sum
	 */
	@Test
	public void testCompositeGradeAdd1GradeSumAndDrop() {
		Sum theSumStrategy = new Sum();
		theSumStrategy.setDropLowestGrade(true);
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(0, theGradeList.getValue(), 0);
	}
	
	/**
	 * Drop lowest grade with multiples and sum strategy
	 */
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
	
	/**
	 * Drop lowest grade with sum and a zero edge case
	 */
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
	
	/**
	 * Drop lowest grade with multiples and average strategy
	 */
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
	
	/**
	 * Test with average, multiple grades with a zero
	 */
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
