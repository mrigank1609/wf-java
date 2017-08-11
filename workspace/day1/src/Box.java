
public class Box {
	private int length;
	private int breadth;
	private int height;
	private String color="Colorless";
	
	
	public Box(int length, int breadth, int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	public Box(int length, int breadth, int height,String color){
		this(length,breadth,height);
		this.color=color;
	}
	
	public Box(int length){
		this(length,length,length);
	}
	
	public Box(int length,String color){
		this(length,length,length,color);
	}
	
 int getVolume() {
		return length * breadth * height;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setLength(int length){
		this.length=length;
	}
	
	
}
