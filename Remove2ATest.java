package com.bvrith.CustomCollections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove2ATest {
	@Test
	void test0chars() {
		Remove2A r = new Remove2A();
		String actual = r.remove("");
		assertEquals("", actual);
	}
	@Test
	void test1chars() {
		Remove2A r = new Remove2A();
		String actual = r.remove("B");
		assertEquals("B", actual);
	}
	@Test
	void test2chars() {
		Remove2A r = new Remove2A();
		String actual = r.remove("BA");
		assertEquals("B", actual);
	}
	@Test
	void testnchars() {
		Remove2A r = new Remove2A();
		String actual = r.remove("AABAA");
		assertEquals("BAA", actual);
	}
	
	
	

}
