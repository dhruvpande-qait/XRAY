package com.qait.demo.demoTests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestClass {
	
	@Test
	public void test_1(){
		Assert.assertEquals("hello", "helo");
	}
	
}
