package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@BeforeMethod
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void display() {
		System.out.println("TESTER");
		System.out.println("SHAMEER");
		System.out.println("GIT");
		System.out.println("DOT");
	}

	@AfterMethod
	public void test2() {
		System.out.println("Test2");
	}
}
