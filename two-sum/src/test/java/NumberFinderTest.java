import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberFinderTest {

	private NumberFinder numberFinder = new NumberFinder();

	@Test
	public void findAmongAnArrayOfTwoShouldReturnTheFirstAndSecondIndex() {
		int[] integers = new int[] { 1, 1 };
		int numberToFind = 2;
		String expected = "0, 1";

		String actual = numberFinder.find(integers, numberToFind);

		assertEquals(expected, actual);
	}

	@Test
	public void findWhenTheRightIndexesAreAtTheEndOfTheArray() {
		int[] integers = new int[] { 16, 5, 34, 54, 12, 32, 34, 1, 1 };
		int numberToFind = 2;
		String expected = "7, 8";

		String actual = numberFinder.find(integers, numberToFind);

		assertEquals(expected, actual);
	}
}
