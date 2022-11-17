package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test()
	{
		
		JUnitFunctions junitstring = new JUnitFunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals ("capstoneproject", result);
		
	}
}

	
