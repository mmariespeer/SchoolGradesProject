package edu.westga.cs.schoolgrades;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompositeGradeConstructorGetterAndSetter {

	@Test
	public void testCompositeConstructorToBeEmptyList() {
		Sum theSumStrategy = new Sum();
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		assertEquals(0, theGradeList.getCompositeGradeList().size());
	}
	
	@Test
	public void testCompositeConstructorToSetGetStrategy() {
		Sum theSumStrategy = new Sum();
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		assertEquals(theSumStrategy, theGradeList.getStrategy());
	}

}
