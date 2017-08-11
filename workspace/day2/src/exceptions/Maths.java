package exceptions;

public class Maths {

	public double divide(int a, int b) {
		double result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
}
