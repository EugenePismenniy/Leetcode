package com.leetcode.task.reverseint;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author evgeniy.pismenny on 22.06.17 15:26.
 */
@RunWith(JUnitParamsRunner.class)
public class ReverseIntegerTest {

	ReverseInteger reverseInteger = new ReverseInteger();


	@Parameters(method = "provideTestData")
	@Test
	public void reverse(int x, int expected) {
		assertThat(reverseInteger.reverse(x), is(expected));
	}

	public Object[] provideTestData() {
		return new Object[] {
				new Object[] {100, 1},
				new Object[] {1005, 5001},
				new Object[] {123, 321},
				new Object[] {-123, -321},
				new Object[] {1000000003, 0},
				new Object[] {-2147483648, 0},

		};
	}
}