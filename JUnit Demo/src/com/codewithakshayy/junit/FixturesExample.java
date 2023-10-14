package com.codewithakshayy.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * @BeforeClass - execute only once before calling any test case (method)
 * 
 * @AfterClass - execute only once after calling all test cases (methods)
 * 
 * @Before - executes before every test cases (methods)
 * 
 * @After - executes after every test cases (methods)
 */

public class FixturesExample {

	@BeforeClass
	public static void setUpClass() {
		System.out.println("@BeforeClass - setUpClass");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("@AfterClass - tearDownClass");
	}

	@Before
	public void setUp() {
		System.out.println("@Before - setUp");
	}

	@After
	public void tearDown() {
		System.out.println("@After - tearDown");
	}

	@Test
	public void runTest() {
		System.out.println("@Test - runTest");
		System.out.println("Inside the runTest()");
	}

}
