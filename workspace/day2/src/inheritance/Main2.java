package inheritance;

public class Main2 {

	public static void main(String[] args) {
		Employee e= new Employee(100, "Scott", 30000);
		
		System.out.println(e.getDetails());
		
		TraineeEmp te= new TraineeEmp(100, "Scott", 30000, "Good");
		
		System.out.println(te.getDetails());

	}

}
