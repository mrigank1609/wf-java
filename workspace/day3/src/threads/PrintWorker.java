package threads;

public class PrintWorker implements Runnable {
	String message;
	MyResource resource;

	public PrintWorker(String message, MyResource resource) {
		this.resource = resource;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (resource) {
			resource.printMessage(message);
		}
		
	}
}
