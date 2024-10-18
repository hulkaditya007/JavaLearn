package javaLearn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ThreadSafeAl extends Thread {
	static List<Integer> al = Collections.synchronizedList(new ArrayList<>());

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			al.add(i);
			System.out.println("Current thread name " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new ThreadSafeAl();
		Thread t2 = new ThreadSafeAl();
		Thread t3 = new ThreadSafeAl();

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println(al);

	}

}
