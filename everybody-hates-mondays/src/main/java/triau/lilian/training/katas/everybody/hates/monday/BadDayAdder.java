package triau.lilian.training.katas.everybody.hates.monday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BadDayAdder {

	public long countMondaysSinceBirthDay(LocalDate birthday) {
		LocalDate startWorkingAge = birthday.plusYears(22);
		LocalDate endWorkingAge = LocalDate.now().isBefore(birthday.plusYears(78)) ? LocalDate.now()
				: birthday.plusYears(78);
		return startWorkingAge.isAfter(LocalDate.now()) ? 0 : ChronoUnit.WEEKS.between(startWorkingAge, endWorkingAge);
	}
}