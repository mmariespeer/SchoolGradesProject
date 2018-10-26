package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test compositeGrade with average strategy
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class TestCompositeGradeAverageStrategy {

	/**
	 * add one grade with average strategy
	 */
	@Test
	public void testCompositeGradeAdd1GradeAverage() {
		Average theAverageStrategy = new Average();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theAverageStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(75, theGradeList.getValue(), 75);
	}
	
	/**
	 * add multiple grades with average strategy
	 */
	@Test
	public void testCompositeGradeAddMultipleGradesAverage() {
		Average theAverageStrategy = new Average();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(95.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		CompositeGrade theGradeList = new CompositeGrade(theAverageStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		assertEquals(87.5, theGradeList.getValue(), 0);
	}
	
	/**
	 * add multiple grades with average strategy with a zero
	 */
	@Test
	public void testCompositeGradeAddMultipleGradesWithZeroAverage() {
		Average theAverageStrategy = new Average();
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
		assertEquals(70, theGradeList.getValue(), 0);
	}

}
