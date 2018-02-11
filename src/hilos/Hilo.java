package hilos;

public class Hilo extends Thread {

	private String threadName;

	public Hilo() {
	}

	// Constructor aux para indicar el nombre del hilo que le llama
	public Hilo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			System.out.println(threadName + " " + i);
		}

	}

}
