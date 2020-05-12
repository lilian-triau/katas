package triau.lilian.training.katas.naughty.or.nice;

import java.util.List;
import java.util.stream.Collectors;

public class BehaviourChecker {

	public List<String> getNiceNames(List<Person> persons) {
		return getPersonality(persons, true);
	}

	public List<String> getNaughtyNames(List<Person> persons) {
		return getPersonality(persons, false);
	}

	private List<String> getPersonality(List<Person> persons, boolean wasNice) {
		return persons.stream().filter(p -> wasNice == p.wasNice()).map(p -> p.getName()).collect(Collectors.toList());
	}

}
