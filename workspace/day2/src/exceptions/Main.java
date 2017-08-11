package exceptions;

public class Main {

	public static void main(String[] args) {
		try{
		Maths m= new Maths();
		double res=m.divide(3, 0);
		System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println("devide Overflow...");
		}

	}

}
