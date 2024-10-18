package javaLearn;

import java.util.ArrayList;
import java.util.List;

interface StockObserver{
	void update();
}

class Engine{
	private int a;
	private List<StockObserver> obersers;
	
	public Engine(int a) {
		this.a = a;
		this.obersers = new ArrayList<>();
	}
	
	public void addOberservers(StockObserver observers) {
		this.obersers.add(observers);
	}
	
	public void removeObservers(StockObserver observers) {
		this.obersers.remove(observers);
	}
	
	public List<StockObserver> getObserver() {
		return this.obersers;
	}
	
}

class Cars24 implements StockObserver{
	String val;
	
	Cars24(String st){
		this.val = st;
	}

	@Override
	public void update() {
		System.out.println(this.val);
		
	}
	
	public String getValue() {
		return this.val;
	}
	
}

public class ObserverDesign {

	public static void main(String[] args) {
		Cars24 cr1 = new Cars24("Hello");
		Engine e1 = new Engine(23);
		e1.addOberservers(cr1);
		List<StockObserver> li = e1.getObserver();
		li.get(0).update();
		
		

	}

}
