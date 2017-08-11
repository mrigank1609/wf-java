
public class BoxMain {

	public static void main(String[] args) {
		Box b= new Box(10,20,30);
		
		
		int vol=b.getVolume();
		
		System.out.println(vol);
		
		
		b.setLength(30);
		System.out.println(b.getColor());
		
		Box b1= new Box(10,20,30,"blue");
		System.out.println(b1.getColor());
		
		Box cube= new Box(20);
	
	}
}
