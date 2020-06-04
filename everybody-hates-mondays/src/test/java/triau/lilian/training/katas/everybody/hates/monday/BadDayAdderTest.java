package triau.lilian.training.katas.everybody.hates.monday;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class BadDayAdderTest {

	private BadDayAdder badDayAdder = new BadDayAdder();

	@Test
	public void countMondaysSinceBirthDayWithBirthdaySetToTodayShouldReturn0() {
		long expected = 0;
		LocalDate birthDay = LocalDate.now();

		long actual = badDayAdder.countMondaysSinceBirthDay(birthDay);

		assertEquals(expected, actual);
	}

	@Test
	public void countMondaysSinceBirthDayWithBirthdayIsUnderWorkingAgeShouldReturn0() {
		long expected = 0;
		LocalDate birthday = LocalDate.now().minusYears(21);

		long actual = badDayAdder.countMondaysSinceBirthDay(birthday);

		assertEquals(expected, actual);
	}

	@Test
	public void countMondaysSinceBirthDayWithOneWeekOfWorkingAgeShouldReturn1() {
		long expected = 1;
		LocalDate birthday = LocalDate.now().minusYears(22).minusWeeks(1);

		long actual = badDayAdder.countMondaysSinceBirthDay(birthday);

		assertEquals(expected, actual);
	}

	@Test
	public void countMondaysSinceBirthDayWithOneYearOfWorkingAgeShouldReturn52() {
		long expected = 52;
		LocalDate birthday = LocalDate.now().minusYears(23);

		long actual = badDayAdder.countMondaysSinceBirthDay(birthday);

		assertEquals(expected, actual);
	}

	@Test
	public void countMondaysSinceBirthDayWithBirthdayIsOverWorkingAgeByOneWeekShouldReturn2922() {
		long expected = 2922;
		LocalDate birthday = LocalDate.now().minusYears(78).minusWeeks(1);

		long actual = badDayAdder.countMondaysSinceBirthDay(birthday);

		assertEquals(expected, actual);
	}
}
