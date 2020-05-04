package triau.lilian.training.katas.lateride.impl;

import triau.lilian.training.katas.lateride.TimeCalculator;

public class OldSchoolTimeCalculator implements TimeCalculator {

	public int renderTimeSinceMidnight(Integer minutePassed) {
		int hours = minutePassed / 60;
		int minutes = minutePassed % 60;

		return sumDigits(hours) + sumDigits(minutes);
	}

	private int sumDigits(int number) {
		int sumOfDigits = 0;
		char[] numberToChar = String.valueOf(number).toCharArray();
		for (char c : numberToChar) {
			sumOfDigits += Integer.valueOf(String.valueOf(c));
		}
		return sumOfDigits;
	}
}
