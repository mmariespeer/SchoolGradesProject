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

}
