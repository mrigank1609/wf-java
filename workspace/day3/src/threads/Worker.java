package threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts");
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName() + " : Task " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " exits");
	}

}
