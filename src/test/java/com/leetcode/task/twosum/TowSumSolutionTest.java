package com.leetcode.task.twosum;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author evgeniy.pismenny on 21.06.17 18:18.
 */
@RunWith(JUnitParamsRunner.class)
public class TowSumSolutionTest {

	final TowSumSolution towSumSolution = new TowSumSolution();

	@Parameters(method = "provideTestData")
	@Test
	public void testTwoSum(int[] nums, int target, int[] expected)
	{
		int[] actual = towSumSolution.twoSum(nums, target);

		assertThat(actual, notNullValue());
		assertThat(actual, equalTo(expected));
	}


	public Object[] provideTestData() {
		return new Object[]{
				new Object[]{new int[]{}, 0, new int[]{}},
				new Object[]{new int[]{4,7,3,5,7,8}, 14, new int[]{1, 4}},
				new Object[]{new int[]{-1,-2,-3,-4,-5}, -8, new int[]{2,4}}
		};
	}



}
