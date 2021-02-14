import java.util.HashMap;
import java.util.Map;

public class NumberFinder {

	public String find(int[] integers, int numberToFind) {
		String result = "";

		Map<Integer, Integer> wantedNumbers = new HashMap<>();

		for (int numberIndex = 0; numberIndex < integers.length; numberIndex++) {
			int currentInteger = integers[numberIndex];
			Integer wantedNumber = numberToFind - currentInteger;
			if (wantedNumbers.containsKey(wantedNumber)) {
				result = String.format("%d, %d", wantedNumbers.get(wantedNumber), numberIndex);
				break;
			} else {
				wantedNumbers.put(currentInteger, numberIndex);
			}
		}
		return result;
	}

}
