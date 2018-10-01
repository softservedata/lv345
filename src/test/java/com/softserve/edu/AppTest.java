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

	@Test
	public void testApp3() {
		System.out.println("getProperty JENKINS_INFO = " + System.getProperty("JENKINS_INFO"));
		System.out.println("getenv JENKINS_INFO = " + System.getenv("JENKINS_INFO"));
	}

}
