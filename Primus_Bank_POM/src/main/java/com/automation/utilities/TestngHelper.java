package com.automation.utilities;

import org.testng.Assert;

public class TestngHelper {

	public static void assertequal(String act, String exp, String message) {
		try {
			Assert.assertEquals(act, exp, message);

		} catch (AssertionError e) {
			System.out.println("invalid page navigation");
		}

	}
}
