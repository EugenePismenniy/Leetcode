package com.leetcode.task.island;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author evgeniy.pismenny on 23.06.17 15:54.
 */
@RunWith(JUnitParamsRunner.class)
public class IslandPerimeterTest {

	IslandPerimeter perimeter = new IslandPerimeter();

	@Parameters(method = "provideTestData")
	@Test
	public void testIslandPerimeter(int[][] grid, int expected) throws Exception {
		assertThat(perimeter.islandPerimeter(grid), is(expected));
	}


	public Object[] provideTestData() {
		return new Object[] {
			new Object[] {
				new int[][] {
						{0,1,0,0},
						{1,1,1,0},
						{0,1,0,0},
						{1,1,0,0}
				}, 16
			},
		};
	}



}