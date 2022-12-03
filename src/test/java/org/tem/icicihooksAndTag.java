package org.tem;

import org.sam.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class icicihooksAndTag extends BaseClass{
	@Before(value="@sanity")
	private void precondition() {
		System.out.println("Precondition 1");
		
	}
	@After(value="@sanity")
	private void postcondition() {
		System.out.println("postcondition1");
		

	}

}
