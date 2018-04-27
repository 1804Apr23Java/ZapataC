package test.java.com.revature.awesomeset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AwesomeSetTest {
	
	/*
	 * Build a test for a collection called AwesomeSet that we are building 
	 * with  our own implementation
	 */
	
//	@Before

	
	@Test
	// see if the values of the array are null
	public void testEmptySet() {
		//int len = a.length;
		//final int[] expectedArray = new int[len]; // do we need final?
	
		final int z =1;
		final int [] b = new int [5];
		final int t = AwesomeSet.checkIsEmpty(b);
		
		assertEquals(1,t);
	}
	
	@Test
	public void testUniqueness() {
		int [] b = new int [] {1,2,3};
		AwesomeSet a = new AwesomeSet(b);
		boolean check = a.isUnique(a);
		
		
		assertEquals(true, check);
	}
	@Test
	public void testContains() {
		int [] b = new int [] {1,2,3};
		AwesomeSet a = new AwesomeSet(b);
		assertEquals(true, a.contains(2, a));
	
	}
	
	@Test
	/*
	 * check if array grows with new value
	 */
	public void testValueAdded() {
		
	}
	
	@Test
	public void testValueRemoved() {
		
	}
	
	@Test
	public void testValueRetrieved() {
		
	}

}
