package edu.westga.cs.schoolgrades;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeightedGrade {

	@Test
	public void testWeightedGradeConstructorValidValues() {
		WeightedGrade theGrade = new WeightedGrade(50.0, .50);
		assertEquals(25.0, theGrade.getValue(), 0);
	}
	
	@Test
	public void testWeightedGradeConstructorValidValuesZero() {
		WeightedGrade theGrade = new WeightedGrade(75.0, 0);
		assertEquals(0, theGrade.getValue(), 0);
	}
	
	@Test
	public void testWeightedGradeConstructorValidValuesHighEdgeCase() {
		WeightedGrade theGrade = new WeightedGrade(100.0, 1);
		assertEquals(100.0, theGrade.getValue(), 0);
	}
	
	/**
	 * Test IllegalArgument negative value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateWeightedGradeNegative() {
		new WeightedGrade(-8, .6);
	}
	
	/**
	 * Test IllegalArgument negative value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateWeightedGradeInvalidWeightLow() {
		new WeightedGrade(75, -5.0);
	}
	
	/**
	 * Test IllegalArgument negative value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateWeightedGradeInvalidWeightHigh() {
		new WeightedGrade(75, 1.1);
	}

}
