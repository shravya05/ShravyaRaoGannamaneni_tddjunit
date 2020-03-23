package com.epam.Tddjunitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveFirst2CharsTest {

	/* TODO list for my feature
	 * 1. 4 chars : ABCD => BCD
	 * 2. 4 chars : AACD => CD
	 * 3. 4 chars :BACD => BCD
	 * 4. 4 chars :BBAA => BBAA
	 * 5. 5 chars :AABAA => BAA
	 * 6. empty char :"" =>""
	 */
	@Test
	void test2chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("ABCD");
		assertEquals("BCD", actual);
	}
	@Test
	void test3chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("AACD");
		assertEquals("CD", actual);
	}
	@Test
	void test4chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("BACD");
		assertEquals("BCD", actual);
	}
	@Test
	void test5chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("BBAA");
		assertEquals("BBAA", actual);
	}
	@Test
	void test6chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("AABAA");
		assertEquals("BAA", actual);
	}
	@Test
	void test0chars() {
		RemoveFirst2Chars removeFirst2Chars = new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("");
		assertEquals("", actual);
	}
}
