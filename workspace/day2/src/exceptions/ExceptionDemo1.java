package exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] ints=new int[4];
			System.out.println(ints[3]);
			System.out.println("No Exception.....");
		} catch (ArithmeticException e) {
			System.out.println("Ouch!! I am going home, Bye bye");
			//System.exit(0);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This is finally...");
		}
		System.out.println("Execution resumed...");
	}

}
