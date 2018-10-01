package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testApp1() {
		Calc calc = new Calc();
		double expected = 4;
		double actual = calc.add(2, 2);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testApp2() {
		Calc calc = new Calc();
		double expected = 7;
		double actual = calc.add(2, 5);
		Assert.assertEquals(expected, actual, 0.001);
	}

}
