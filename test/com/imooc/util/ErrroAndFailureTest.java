package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrroAndFailureTest {

	@Test
	public void testAdd() {
		assertEquals(5, new Calculate().add(3, 3));
	}
	
	public void testDivide() {
		assertEquals(3, new Calculate().divide(6, 0));
	}

}
