package triau.lilian.training.katas.naughty.or.nice;

public class Person {

	public Person(String name, boolean wasNice) {
		this.name = name;
		this.wasNice = wasNice;
	}

	private String name;
	private boolean wasNice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean wasNice() {
		return wasNice;
	}

	public void setWasNice(boolean wasNice) {
		this.wasNice = wasNice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (wasNice ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wasNice != other.wasNice)
			return false;
		return true;
	}

}
