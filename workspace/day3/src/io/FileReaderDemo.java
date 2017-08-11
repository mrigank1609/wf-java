package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fis= new FileReader("G:\\wf-java2\\chapter 4 sample.pdf");
		FileWriter fos= new FileWriter("G:\\wf-java2\\chapter 4 sample1.pdf");
		
		int c=0;
		while((c=fis.read())!=-1){
			//System.out.print((char)c);
			fos.write(c);
			fos.flush();
			
		}
	}

}
