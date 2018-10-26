package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompositeGradeSumStrategy {

	@Test
	public void testCompositeGradeAdd1Grade() {
		Sum theSumStrategy = new Sum();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(75, theGradeList.getValue(), 75);
	}
	
	@Test
	public void testCompositeGradeAddMultipleGrades() {
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
	
	@Test
	public void testCompositeGradeAddMultipleGradesWithZero() {
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
