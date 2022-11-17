package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() 
	{
		
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
		
	}

}
