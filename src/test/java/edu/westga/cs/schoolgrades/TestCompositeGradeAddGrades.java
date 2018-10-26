package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompositeGradeAddGrades {

	@Test
	public void testCompositeGradeAddGrade() {
		Sum theSumStrategy = new Sum();
		SimpleGrade aNewGrade = new SimpleGrade(75.0);
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		theGradeList.addGradeToCompositeList(aNewGrade);
		assertEquals(1, theGradeList.getCompositeGradeList().size());
		assertEquals(75.0, theGradeList.getCompositeGradeList().get(0).getValue(), 0);
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
		assertEquals(4, theGradeList.getCompositeGradeList().size());
		assertEquals(75.0, theGradeList.getCompositeGradeList().get(0).getValue(), 0);
		assertEquals(80.0, theGradeList.getCompositeGradeList().get(1).getValue(), 0);
		assertEquals(95.0, theGradeList.getCompositeGradeList().get(2).getValue(), 0);
		assertEquals(100.0, theGradeList.getCompositeGradeList().get(3).getValue(), 0);
	}

}
