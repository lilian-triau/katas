package triau.lilian.training.katas;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {

	public String reverseAndRetainSpaces(final String input) {
		return input.isBlank() ? input
				: Stream.of(input.split(" ")).map(word -> new StringBuffer(word).reverse())
						.collect(Collectors.joining(" "));
	}
}
