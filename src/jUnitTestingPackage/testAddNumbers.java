package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
        int result = junit.addNum(34, 35);
        assertEquals (69, result);
	}

}
