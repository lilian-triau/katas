package triau.lilian.training.katas;

public class ReverseWord {

	/**
	 * Reverse every word from the input, retaining all spaces
	 * 
	 * @param input
	 * @return
	 */
	public String reverseAndRetainSpaces(final String input) {
		String invertedInput = "";
		boolean isFirstWord = true;

		for (String word : input.split(" ")) {
			String inverted = reverse(word);
			if (!isFirstWord) {
				invertedInput += " ";
			}
			invertedInput += inverted;
			isFirstWord = false;
		}

		return invertedInput.isBlank() ? input : invertedInput;
	}

	private String reverse(String word) {
		String inverted = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			inverted += String.valueOf(word.charAt(i));
		}
		return inverted;
	}

}
