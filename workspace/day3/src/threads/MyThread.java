package threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(this.getName() + " Starts");
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(this.getName() + " : Task " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " exits");
	}

}
