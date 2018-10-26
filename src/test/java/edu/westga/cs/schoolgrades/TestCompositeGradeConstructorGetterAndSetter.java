package edu.westga.cs.schoolgrades;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test composite grade constructor
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class TestCompositeGradeConstructorGetterAndSetter {

	/**
	 * Should initialize as an empty list
	 */
	@Test
	public void testCompositeConstructorToBeEmptyList() {
		Sum theSumStrategy = new Sum();
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		assertEquals(0, theGradeList.getCompositeGradeList().size());
	}
	
	/**
	 * Should set as passed in strategy
	 */
	@Test
	public void testCompositeConstructorToSetGetStrategy() {
		Sum theSumStrategy = new Sum();
		CompositeGrade theGradeList = new CompositeGrade(theSumStrategy);
		assertEquals(theSumStrategy, theGradeList.getStrategy());
	}

}
