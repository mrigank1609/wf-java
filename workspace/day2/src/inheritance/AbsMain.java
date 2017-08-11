package inheritance;

public class AbsMain {

	public static String showArea(Figure ref) {
		return ref.getArea() + "";
	}

	public static void main(String[] args) {
		Triangle t = new Triangle(20, 40);
		Rectangle r = new Rectangle(20, 40);
		
		System.out.println("Triangle Area :"+showArea(t));
		System.out.println("Rectangle Area :"+showArea(r));

	}

}
