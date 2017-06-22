package com.leetcode.task.twosum;

/**
 * https://leetcode.com/problems/two-sum/#/description
 *
 * @author evgeniy.pismenny on 21.06.17 18:08.
 */
public class TowSumSolution {

	public int[] twoSum(int[] nums, int target) {

		int[] map = new int[50000];

		for (int i = 0; i < nums.length; i ++) {
			int j = (target - nums[i]) + 20000;
			if (map[j] == 0) {
				map[j] = i + 1;
			}
		}

		for (int i = 0; i < nums.length; i ++) {
			int j = nums[i] + 20000;
			if (map[j] > 0 && (map[j] - 1) != i) {
				return new int[] {i, map[j] - 1};
			}
		}

		return new int[] {};
	}




}
