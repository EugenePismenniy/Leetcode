package com.leetcode.task.reverseint;

/**
 *
 * https://leetcode.com/problems/reverse-integer/#/description
 *
 * @author evgeniy.pismenny on 22.06.17 14:07.
 */
public class ReverseInteger {


	public int reverse(int x) {

		long x2 = Math.abs((long)x);
		long res = 0;

		while (x2 > 0) {

			res *= 10;
			res += x2 % 10;
			x2 /= 10;

			if (res > Integer.MAX_VALUE) {
				return 0;
			}
		}

		return (int) (x > 0 ? res : -res);
	}

	public int reverse1(int x) {

		char[] chars = String.valueOf(Math.abs((long)x)).toCharArray();

		char[] chars2 = new char[chars.length];

		for (int i = 0, j = chars.length - 1; i < chars.length; i ++, j --) {
			chars2[i] = chars[j];
		}

		long l = Long.parseLong(new String(chars2));

		if (l > Integer.MAX_VALUE) {
			return 0;
		} else {
			return (int) (x > 0 ? l : -l);
		}
	}

	public int reverse0(int x) {

		char[] chars = String.valueOf(x).toCharArray();

		int i = 0;
		int k = 1;
		if (chars[0] == '-') {
			i = 1;
			k = -1;
		}

		long result = 0;
		for (; i < chars.length; i ++, k *= 10) {
			result += (chars[i] - 48L) * k;
		}

		return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
	}



}
