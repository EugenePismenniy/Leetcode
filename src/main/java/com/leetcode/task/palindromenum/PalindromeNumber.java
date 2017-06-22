package com.leetcode.task.palindromenum;

/**
 * https://leetcode.com/problems/palindrome-number/#/description
 *
 * @author evgeniy.pismenny on 22.06.17 16:55.
 */
public class PalindromeNumber {


	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		if (x <= 9) {
			return true;
		}

		int tmp = x;
		int res = 0;

		while (tmp > 0) {
			res *= 10;
			res += tmp % 10;
			tmp /= 10;
		}

		return x == res;
	}
}
