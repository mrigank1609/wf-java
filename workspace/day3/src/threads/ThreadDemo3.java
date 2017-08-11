package threads;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1= new Thread(){
			
			@Override
			public void run() {
				System.out.println("Thread Demo");
			}
		};

		t1.start();
	}

	Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			
		}
	});
}
