package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
	public static void main(String[] args) throws FileNotFoundException{

		FileInputStream fis = new FileInputStream("c:\\temp\\abc.txt");
	}
}
