package com.leetcode.task.longestsubstring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author evgeniy.pismenny on 22.06.17 17:40.
 */
@RunWith(JUnitParamsRunner.class)
public class LongestUnqSubstringTest {


	LongestUnqSubstring longestUnqSubstring = new LongestUnqSubstring();


	@Parameters(method = "provideTestData")
	@Test
	public void testLengthOfLongestSubstring(String s, int expected) {
		assertThat(longestUnqSubstring.lengthOfLongestSubstring(s), is(expected));
	}


	public Object[] provideTestData() {
		return new Object[] {
			new Object[] {"abcabcbb", 3},
			new Object[] {"bbbbb", 1},
			new Object[] {"pwwkew", 3},
			new Object[] {"a", 1},
			new Object[] {"", 0},
			new Object[] {"au", 2},
			new Object[] {"dvdf", 3},
			new Object[] {"tmmzuxt", 5},
			new Object[] {"bbtablud", 6},
		};
	}


}
