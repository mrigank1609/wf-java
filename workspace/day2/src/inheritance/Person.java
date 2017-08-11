package inheritance;

public class Person {
	protected String name;
	protected int id;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getDetails() {
		return id + " " + name;
	}
}
