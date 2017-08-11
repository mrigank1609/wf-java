package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis= new FileInputStream("G:\\wf-java2\\chapter 4 sample.pdf");
		FileOutputStream fos= new FileOutputStream("G:\\wf-java2\\chapter 4 sample1.pdf");
		
		int c=0;
		while((c=fis.read())!=-1){
			System.out.print((char)c);
			fos.write(c);
			fos.flush();
		}
	}

}
