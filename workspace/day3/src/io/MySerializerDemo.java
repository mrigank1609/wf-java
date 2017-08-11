package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializerDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("data.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Email mail = new Email("abc@gmail.com", "xyz@gmail.com", 
				"We will break at 5:00pm");
		oos.writeObject(mail);
		oos.flush();
		oos.close();
		System.out.println("The Object has been Serialized..");

	}
}
