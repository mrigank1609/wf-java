package threads;

public class ThreadApp1 {

	
	public static void main(String[] args) throws Exception{
		System.out.println("Main Thread starts....");
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		Thread.currentThread().getName();
		System.out.println("Main Thread exits....");
	}

}
