package triau.lilian.training.katas.lateride.impl;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import triau.lilian.training.katas.lateride.TimeCalculator;

public class LambdaTimeCalculator implements TimeCalculator {

	private static final Predicate<String> ONLY_DIGIT = Pattern.compile("\\d").asPredicate();

	@Override
	public int renderTimeSinceMidnight(Integer minutePassed) {
		String formatedMinutePassed = LocalTime.MIN.plus(Duration.ofMinutes(minutePassed)).toString();

		return Arrays.stream(String.valueOf(formatedMinutePassed).split("")).filter(ONLY_DIGIT)
				.mapToInt(Integer::parseInt).sum();
	}
}
