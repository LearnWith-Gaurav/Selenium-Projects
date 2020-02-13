package com.groupings;

import org.testng.annotations.Test;

/**
*
@author: Gaurav Wani
*
**/
public class GroupingInTestNG {
	
	@Test(groups={"smoke"})
	public void testcase1(){
		System.out.println("smoke test");
	}
	
	@Test(groups={"sanity"})
	public void testcase2(){
		System.out.println("sanity test");
	}
	
	@Test(groups={"sanity"})
	public void testcase3(){
		System.out.println("sanity test");
	}
	
	@Test(groups={"regression"})
	public void testcase5(){
		System.out.println("regression test");
	}
	
	@Test(groups={"regression"})
	public void testcase6(){
		System.out.println("regression");
	}
	
	@Test(groups={"sanity","regression"})
	public void testcase7(){
		System.out.println("sanity or regression");
	}
	
	@Test(groups={"smoke"})
	public void testcase8(){
		System.out.println("smoke test");
	}

}
