package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstr = new jUnitFunction();
        String result = junitstr.addString("HI I'm Devrishi ", "wbu?");
        assertEquals("HI I'm Devrishi wbu?", result);
	}

}
