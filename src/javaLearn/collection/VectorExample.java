package javaLearn.collection;

import java.util.Vector;

public class VectorExample extends Thread {
	private static Vector<Integer> v = new Vector<>();

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			v.add(i);
			System.out.println(Thread.currentThread().getName() + " added: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new VectorExample();
		Thread t2 = new VectorExample();
		Thread t3 = new VectorExample();
		t1.start();
		t2.start();
		t3.start();

		// Ensuring all threads finish execution before accessing the vector
		t1.join();
		t2.join();
		t3.join();

		System.out.println(v);
	}

}
