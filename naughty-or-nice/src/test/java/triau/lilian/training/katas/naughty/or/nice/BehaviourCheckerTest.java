package triau.lilian.training.katas.naughty.or.nice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BehaviourCheckerTest {

	BehaviourChecker behaviourChecker = new BehaviourChecker();

	@Test
	public void getNiceNamesWithNoNamesGivenShouldReturnAnEmptyArray() {
		List<Person> persons = Collections.emptyList();
		List<String> expected = Collections.emptyList();

		List<String> actual = behaviourChecker.getNiceNames(persons);

		assertEquals(expected, actual);
	}

	@Test
	public void getNiceNamesWithOneNicePersonGivenShouldReturnTheNameOfTheNicePerson() {
		List<Person> persons = Arrays.asList(new Person("Thor", true));
		List<String> expected = Arrays.asList("Thor");

		List<String> actual = behaviourChecker.getNiceNames(persons);

		assertEquals(expected, actual);
	}

	@Test
	public void getNiceNamesWithOneNicePersonAndOneNaughtyPersonGivenShouldReturnTheNameOfTheNicePerson() {
		List<Person> persons = Arrays.asList(new Person("Thor", true), new Person("Loki", false));
		List<String> expected = Arrays.asList("Thor");

		List<String> actual = behaviourChecker.getNiceNames(persons);

		assertEquals(expected, actual);
	}

	@Test
	public void getNaughtyNamesWithOneNicePersonGivenShouldReturnTheNameOfTheNaughtyPerson() {
		List<Person> persons = Arrays.asList(new Person("Loki", false));
		List<String> expected = Arrays.asList("Loki");

		List<String> actual = behaviourChecker.getNaughtyNames(persons);

		assertEquals(expected, actual);
	}

	@Test
	public void getNaughtyNamesWithOneNaughtyPersonAndOneNicePersonGivenShouldReturnTheNameOfTheNaughtyPerson() {
		List<Person> persons = Arrays.asList(new Person("Thor", true), new Person("Loki", false));
		List<String> expected = Arrays.asList("Loki");

		List<String> actual = behaviourChecker.getNaughtyNames(persons);

		assertEquals(expected, actual);
	}
}
