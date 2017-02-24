package com.gatto.tdd.course;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

	private static Map<Character, Integer> table = new HashMap<Character, Integer>() {
		private static final long serialVersionUID = 8743329609568157384L;
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public int convert(String romanNumber) {
		int sum = 0;
		int lastNumberInTheRight = 0;
		for (int i = romanNumber.length() - 1; i >= 0; i--) {
			int current = table.get(romanNumber.charAt(i));

			int multiplier = 1;
			if (current < lastNumberInTheRight)
				multiplier = -1;

			sum += current * multiplier;

			lastNumberInTheRight = current;
		}
		return sum;
	}

}
