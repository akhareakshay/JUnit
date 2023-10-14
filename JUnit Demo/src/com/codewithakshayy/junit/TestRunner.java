package com.codewithakshayy.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJUnit.class, FixturesExample.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
		System.out.println("failure count : " + result.getFailureCount());
		System.out.println("run count : " + result.getRunCount());

	}

}
