package strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		
		String s5="hello";
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		System.out.println(s4==s3);
		System.out.println(s1==s5);
		

	}

}
