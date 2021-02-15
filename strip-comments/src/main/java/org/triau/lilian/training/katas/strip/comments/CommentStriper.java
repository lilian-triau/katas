package org.triau.lilian.training.katas.strip.comments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;

public class CommentStriper {

	public String removeComments(String input, String[] markers) {
		if (ArrayUtils.isEmpty(markers)) {
			return input;
		}

		List<String> workInProgress = Arrays.asList(input.split("\n"));

		for (String marker : markers) {
			System.out.println("marker: " + marker);
			List<String> workInProgress2 = new ArrayList<>();
			for (String inputWithMarkers : workInProgress) {
				workInProgress2.add(stripFromMarker(marker, inputWithMarkers));
			}
			workInProgress = workInProgress2.stream().collect(Collectors.toList());
		}

		return String.join("\n", workInProgress);
	}

	private String stripFromMarker(String marker, String inputWithMarkers) {
		String striped = "";
		if (inputWithMarkers.contains(marker)) {
			striped = inputWithMarkers.substring(0, inputWithMarkers.indexOf(marker)).stripTrailing();
		} else {
			striped = inputWithMarkers.stripTrailing();
		}

		return striped;
	}

}
