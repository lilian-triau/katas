package org.triau.lilian.training.katas.strip.comments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommentStripperTest {

	private CommentStriper commentStriper = new CommentStriper();

	@Test
	public void stripWithNoMarkerShouldReturnTheStringAsIs() {
		String input = "apples, pears # and bananas\ngrapes\nbananas !apples";
		String[] markers = {};
		String expected = "apples, pears # and bananas\ngrapes\nbananas !apples";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}

	@Test
	public void stripASingleLineInputShouldRemoveEverythingAfterTheMarker() {
		String input = "apples, pears # and bananas";
		String[] markers = { "#" };
		String expected = "apples, pears";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}

	@Test
	public void stripAMultiLineInputShouldRemoveEverythingAfterTheMarkerOnEachLine() {
		String input = "apples, pears # and bananas\nchocolate #and orange";
		String[] markers = { "#" };
		String expected = "apples, pears\nchocolate";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}

	@Test
	public void stripAMultiLineInputWithMultiplesMarkersShouldRemoveEverythingAfterTheMarkersOnEachLine() {
		String input = "apples, pears # and bananas\nchocolate !and orange";
		String[] markers = { "#", "!" };
		String expected = "apples, pears\nchocolate";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}

	@Test
	public void stripAMultiLineInputWithoutMarkerShouldReturnTheStringAsIs() {
		String input = "apples, pears # and bananas\nchocolate !and orange";
		String[] markers = {};
		String expected = "apples, pears # and bananas\nchocolate !and orange";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}

	@Test
	public void stripASingleLineInputWithMultipleMarkersShouldRemoveEverythingAfterTheMarkers() {
		String input = "apples, pears # and bananas/chocolate !and orange";
		String[] markers = { "#", "$" };
		String expected = "apples, pears";

		String actual = commentStriper.removeComments(input, markers);

		assertEquals(expected, actual);
	}
}
