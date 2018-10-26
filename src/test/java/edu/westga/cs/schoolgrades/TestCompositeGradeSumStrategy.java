package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test sum strategy
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class TestCompositeGradeSumStrategy {

	/**
	 * Add 1 grade with sum strategy
	 */
	@Test
	public void testCompositeGradeAdd1GradeSum() {
		Sum theSumStrategy = new Sum();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(75, theGradeList.getValue(), 75);
	}
	
	/**
	 * Add multiple grades with sum strategy
	 */
	@Test
	public void testCompositeGradeAddMultipleGradesSum() {
		Sum theSumStrategy = new Sum();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		SimpleGrade aNewGradeTwo = new SimpleGrade(80.0);
		SimpleGrade aNewGradeThree = new SimpleGrade(95.0);
		SimpleGrade aNewGradeFour = new SimpleGrade(100.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		theGradeList.addGradeToCompositeList(aNewGradeTwo);
		theGradeList.addGradeToCompositeList(aNewGradeThree);
		theGradeList.addGradeToCompositeList(aNewGradeFour);
		assertEquals(350, theGradeList.getValue(), 0);
	}
	
	/**
	 * Add multiple grades with sum strategy and a zero
	 */
	@Test
	public void testCompositeGradeAddMultipleGradesWithZeroSum() {
		Sum theSumStrategy = new Sum();
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

}
