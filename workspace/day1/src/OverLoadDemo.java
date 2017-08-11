
public class OverLoadDemo {

	public void add() {
		System.out.println("Nothing to add...");
	}

	public int add(int a, int b) {
		System.out.println("int, int method is acelled..");
		return a + b;
	}

	public float add(int a, float b) {
		System.out.println("int, float is called...");
		return a + b;
	}

	public double add(double a, double b) {
		System.out.println("double, double is called...");
		return a + b;
	}
	
	
	public static void main(String[] args) {
		OverLoadDemo od= new OverLoadDemo();
		
		od.add();
		od.add(2,3);
		od.add(4,4.5f);
		od.add(2.3,4.5);
		System.out.println(od);
	}
}
