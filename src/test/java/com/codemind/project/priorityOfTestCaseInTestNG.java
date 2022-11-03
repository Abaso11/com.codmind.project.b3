package com.codemind.project;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class priorityOfTestCaseInTestNG {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("Test case for sanity testing");
	}
	@Test(groups = {"retest"})
	public void test2() {
		System.out.println("Test case for retest testing");
	}
	@Test(groups = {"Smoke"})
	public void test3() {
		System.out.println("Test case for Smoke testing");
	}
	@Test(groups = {"regression", "retest"})
	public void test4() {
		System.out.println("Test case for regression testing");
	}
	@Test(groups = {"retest"})
	public void test5() {
		System.out.println("Test case for retest testing");
	}
	@Test(groups = {"retest"})
	public void test6() {
		System.out.println("Test case for retest testing");
	}
	@Test
	public void test7() {
		//String str = "log in successfull";
		//if(str.equals("log in successfull")) {
			throw new SkipException("excution skipped");
		}
	}

//}
