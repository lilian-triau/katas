package triau.lilian.training.katas.lateride;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import triau.lilian.training.katas.lateride.impl.LambdaTimeCalculator;
import triau.lilian.training.katas.lateride.impl.OldSchoolTimeCalculator;

public class TimeCalculatorTest {

	public static Stream<Arguments> provideTimeCalculator() {
		return Stream.of(Arguments.of(new OldSchoolTimeCalculator()), Arguments.of(new LambdaTimeCalculator()));
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhenZeroMinuteHasPassedShouldReturn0(TimeCalculator timeCalculator) {
		int minutePassed = 0;
		int expected = 0;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhenLessThan10MinutesHavePassedShouldReturnTheMinutesPassed(
			TimeCalculator timeCalculator) {
		int minutePassed = 9;
		int expected = 9;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhenLessThanOneHourHasPassedShouldReturnTheSumOfDigitsOfTheMinutes(
			TimeCalculator timeCalculator) {
		int minutePassed = 59;
		int expected = 14;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhenMoreThanOneHourHasPassedShouldReturnTheSumOfDigitsOfTheHoursAndTheMinutes(
			TimeCalculator timeCalculator) {
		int minutePassed = 60;
		int expected = 1;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhenTwoHoursHavePassedShouldReturn4(TimeCalculator timeCalculator) {
		int minutePassed = 240;
		int expected = 4;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("provideTimeCalculator")
	public void renderTimeSinceMidnightWhen808MinutesHavePassedShouldReturn4(TimeCalculator timeCalculator) {
		int minutePassed = 808;
		int expected = 14;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}
}
