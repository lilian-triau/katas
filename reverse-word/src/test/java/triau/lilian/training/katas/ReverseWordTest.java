package triau.lilian.training.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordTest {

	ReverseWord reverseWord = new ReverseWord();

	@Test
	public void computeWordWithOneCharacterShouldReturnTheCharacter() {
		String input = "a";
		String expected = "a";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}

	@Test
	public void computeWordWithTwoWordOfOneCharacterShouldReturnTheTwoWords() {
		String input = "a a";
		String expected = "a a";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}

	@Test
	public void computeWordWithOneWordOfSevenDifferentLettersShouldReturnTheWordInverted() {
		String input = "Chicken";
		String expected = "nekcihC";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}

	@Test
	public void computeWordWithTwoWordsSeparatedByTwoSpacesShouldReturnTheTwoWordsInvertedAndSeparatedByTheTwoSpaces() {
		String input = "Jonh  Doe";
		String expected = "hnoJ  eoD";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}

	@Test
	public void computeWordWithWordsSeparatedByMoreThanOneSpaceShouldReturnTheWordsInvertedAndSeparatedByTheOrginalNumberOfSpaces() {
		String input = "Diamond  Ruby Silver     Gold";
		String expected = "dnomaiD  ybuR revliS     dloG";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}

	@Test
	public void computeWordWithOnlySpacesShouldReturnAllTheSpaces() {
		String input = "     ";
		String expected = "     ";

		String actual = reverseWord.reverseAndRetainSpaces(input);

		assertEquals(expected, actual);
	}
}
