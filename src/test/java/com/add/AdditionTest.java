package com.add;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Addition add=new Addition(10,20);
		assertTrue(add.add()==30);
	}



}
