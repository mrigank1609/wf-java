
public class Duck {
	static{
		System.out.println("The Duck class is loaded....");
	}
	static int count = 0;
	private String name;
	public Duck(String name) {
		this.name=name;
		count++;
	}
	
	
	public static String duckType(){
		return "Wild Duck";
	}
	
	public String getDuckName(){
		return this.name;
	}
}
