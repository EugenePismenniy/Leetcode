package com.leetcode.task.island;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * https://leetcode.com/problems/island-perimeter/#/description
 *
 * @author evgeniy.pismenny on 23.06.17 15:49.
 */
public class IslandPerimeter {

	public int islandPerimeter(int[][] grid) {

		//LinkedList

		int xi = -1;
		int xj = -1;

		f1: for (int i = 0; i < grid.length; i ++)
			for (int j = 0; j < grid.length; j ++)
				if (grid[i][j] == 1) {


					xi = i;
					xj = j;

					break  f1;
				}

		if (xi < 0 && xj < 0)
			return 0;


		// ----------------------

		int i = xi;
		int j = xj;

		while (true) {





			break;
		}


		return 0;
	}


	int calcPartPerimeter(int i, int j, int[][] grid) {

		int perimeter = 0;

		int k = j - 1;
		if (k >= 0 && grid[i][k] == 0) {
			perimeter ++;
		}

		k = j + 1;
		if (k < grid[i].length && grid[i][k] == 0) {
			perimeter ++;
		}

		k = i - 1;
		if (k >= 0 && grid[i][k] == 0) {

		}





		return 0;
	}
}
