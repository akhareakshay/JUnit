package com.codewithakshayy.junit.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void testAdd() {
		String str = "welcome to codewithakshayy - testing JUnit";
		assertEquals("welcome to codewithakshayy ", str);

	}

	@Test
	public void testAdd2() {
		String str = "HI, My name is Akshay AKhare";
		assertEquals("HI, My name is Akshay AKhare", str);
	}

}
