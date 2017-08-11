package collections;

public class Emp {
	private int empId;
	public int getEmpId() {
		return empId;
	}

	private String name;
	private double salary;

	public Emp(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "["+empId + " " + name + " " + salary+"]";
	}
}
