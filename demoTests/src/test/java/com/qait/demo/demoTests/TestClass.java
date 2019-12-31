package com.qait.demo.demoTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass {
	
	@Test
	public void test_1(){
		Assert.assertEquals("Hello", "Hellos");
	}
	
}
