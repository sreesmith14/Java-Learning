package New;

import java.lang.*;

class ThreadB implements Runnable {
	public void run() {
		System.out.println("Method Started");

		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("i = " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Method Ended");
	}
}

public class ThreadEg2 {

	public static void main(String args[]) {
		System.out.println("Main Started");
		ThreadB ta = new ThreadB();
		Thread t = new Thread(ta);
		t.start();
		System.out.println("Main Ended");
	}
}
