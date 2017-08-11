package threads;

public class MyResource {
public /*synchronized*/ void printMessage(String message){
	try{
		System.out.print("["+message);
		Thread.sleep(8000);
		System.out.println("]");
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
}
