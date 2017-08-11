package inheritance;

public class Main3 {

	public static void main(String[] args) {

		Person p = new TraineeEmp(100, "James", 60000, "OK");
		System.out.println(p.getDetails());

		p = new Employee(100, "James", 60000);

		System.out.println(p.getDetails());
		//System.out.println(p.f1());
		
		System.out.println(p);

	}

}
