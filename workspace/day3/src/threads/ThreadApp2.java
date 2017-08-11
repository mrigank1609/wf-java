package threads;

public class ThreadApp2 {

	
	public static void main(String[] args) throws Exception{
		System.out.println("Main Thread starts....");
		
		Thread t1= new Thread(new Worker());
		Thread t2= new Thread(new Worker());
		
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
