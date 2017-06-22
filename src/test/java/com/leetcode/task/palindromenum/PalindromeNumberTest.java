package com.leetcode.task.palindromenum;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author evgeniy.pismenny on 22.06.17 17:18.
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeNumberTest {

	PalindromeNumber palindromeNumber = new PalindromeNumber();

	@Parameters(method = "provideTestData")
	@Test
	public void testIsPalindrome(int x, boolean expected) {
		assertThat(palindromeNumber.isPalindrome(x), is(expected));
	}


	public Object[] provideTestData() {
		return new Object[] {
			new Object[] {-101, false},
			new Object[] {-1, false},
			new Object[] {0, true},
			new Object[] {9, true},
			new Object[] {10, false},
			new Object[] {101, true},
			new Object[] {123454321, true},
			new Object[] {123354321, false},
		};
	}
}
