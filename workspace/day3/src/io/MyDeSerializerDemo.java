package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeSerializerDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj=ois.readObject();
		Email mail=(Email)obj;
		mail.readMail();
		System.out.println("i = "+mail.i);
		System.out.println("The Object has been DeSerialized..");

	}
}
