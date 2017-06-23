package com.leetcode.task.longestsubstring;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
 *
 * @author evgeniy.pismenny on 22.06.17 17:39.
 */
public class LongestUnqSubstring {

	public int lengthOfLongestSubstring(String s) {

		int length = s.length();

		if (length <= 1) {
			return length;
		}

		short[] map = new short[Short.MAX_VALUE];

		short maxLen = 1;

		short currLen = 0;
		short startSubstring = 0;

		for (int i = 0; i < length; i ++) {

			char ch = s.charAt(i);

			short j = (short) (map[ch] - 1);

			if(j < 0 || j < startSubstring) {
				currLen ++;
			} else {
				currLen = (short) (i - j);
				startSubstring = (short) (j + 1);
			}

			map[ch] = (short)(i + 1);

			if (currLen > maxLen) {
				maxLen = currLen;
			}
		}

		return maxLen;
	}


	public int lengthOfLongestSubstring0(String s) {

		if (s.length() == 1) {
			return 1;
		}

		if (s.isEmpty()) {
			return 0;
		}

		short[] map = new short[Short.MAX_VALUE];

		short maxLen = 1;

		short currLen = 0;

		short v = 1;

		for (int i = 0; i < s.length(); i ++) {

			int k = s.charAt(i);

			if(map[k] < v) {
				currLen ++;
				map[k] = v;
			} else {
				i = v - 1;
				v ++;
				currLen = 0;
			}


			if (currLen > maxLen) {
				maxLen = currLen;
			}
		}

		return maxLen;
	}
}
