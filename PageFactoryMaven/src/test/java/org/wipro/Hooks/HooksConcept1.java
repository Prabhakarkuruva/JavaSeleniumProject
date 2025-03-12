package org.wipro.Hooks;

import io.cucumber.java.*;

public class HooksConcept1 {
	@Before(order = 2)
	public void method1() {
		System.out.println("Before Scenario oerder 2");
	}
	
	@Before(order = 1)
	public void method5() {
		System.out.println("Before Scenario order 1");
	}
	
	@BeforeStep
	public void method2() {
		System.out.println("Before each Step of the Scenario");
	}
	
	@AfterStep
	public void method3() {
		System.out.println("After each Step of the Scenario");
	}
	
	@After
	public void method4() {
		System.out.println("After Scenario");
	}

}
