package strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "This is a java class as java is"
				+ " popular and java is good";
		
		String s3=new String("hello");
		String s4=new String("heLlo");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(40));
		
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		String[] parts=s1.split(" ");
		
		//StringBuffer sb= new StringBuffer();
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<parts.length;i++){
			System.out.println(parts[i]);
			sb.append(parts[i]).append(" ");
		}

		System.out.println(sb);
		
		String s="java";
		String s2="c++";
		
		while(sb.indexOf(s)!=-1){
		sb.replace(sb.indexOf(s), sb.indexOf(s)+s.length(), s2+" ");
		}
		System.out.println(sb);
	}

}
