package com.app.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("before Method");
	}

	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("After Method");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

}
