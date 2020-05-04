package triau.lilian.training.katas.lateride;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TimeCalculatorTest {

	TimeCalculator timeCalculator = new TimeCalculator();

	@Test
	public void renderTimeSinceMidnightWhenZeroMinuteHasPassedShouldReturn0() {
		int minutePassed = 0;
		int expected = 0;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@Test
	public void renderTimeSinceMidnightWhenLessThan10MinutesHavePassedShouldReturnTheMinutesPassed() {
		int minutePassed = 9;
		int expected = 9;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@Test
	public void renderTimeSinceMidnightWhenLessThanOneHourHasPassedShouldReturnTheSumOfDigitsOfTheMinutes() {
		int minutePassed = 59;
		int expected = 14;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@Test
	public void renderTimeSinceMidnightWhenMoreThanOneHourHasPassedShouldReturnTheSumOfDigitsOfTheHoursAndTheMinutes() {
		int minutePassed = 60;
		int expected = 1;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@Test
	public void renderTimeSinceMidnightWhenTwoHoursHavePassedShouldReturn4() {
		int minutePassed = 240;
		int expected = 4;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}

	@Test
	public void renderTimeSinceMidnightWhen808MinutesHavePassedShouldReturn4() {
		int minutePassed = 808;
		int expected = 14;

		int actual = timeCalculator.renderTimeSinceMidnight(minutePassed);

		assertEquals(expected, actual);
	}
}
