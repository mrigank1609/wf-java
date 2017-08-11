package lib.demo;

public class ArgDemo {
	public static void main(String[] args) {
		if (args.length >= 1) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
