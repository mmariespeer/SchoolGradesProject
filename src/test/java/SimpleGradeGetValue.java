import static org.junit.Assert.*;
import org.junit.Test;
import edu.westga.cs.schoolgrades.SimpleGrade;
/**
 * Test class for SimpleGrade constructor and getValue() method.
 * @author Melissa Speer Osborne
 * @version 10/25/2018
 */
public class SimpleGradeGetValue {

	/**
	 * Test high end of a normal grade
	 */
	@Test
	public void testCreateSimpleGrade99() {
		SimpleGrade theGrade = new SimpleGrade(99);
		assertEquals(99.0, theGrade.getValue(), 0);
	}
	
	/**
	 * Test low end boundary case
	 */
	@Test
	public void testCreateSimpleGrade0() {
		SimpleGrade theGrade = new SimpleGrade(0);
		assertEquals(0.0, theGrade.getValue(), 0);
	}
	
	/**
	 * Test high end extra credit type grade
	 */
	@Test
	public void testCreateSimpleGrade102() {
		SimpleGrade theGrade = new SimpleGrade(102);
		assertEquals(102.0, theGrade.getValue(), 0);
	}
	
	/**
	 * Test decimal
	 */
	@Test
	public void testCreateSimpleGrade155() {
		SimpleGrade theGrade = new SimpleGrade(15.5);
		assertEquals(15.5, theGrade.getValue(), 0);
	}
	
	/**
	 * Test IllegalArgument negative value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSimpleGradeNegative() {
			new SimpleGrade(-8);
	}
	
}
