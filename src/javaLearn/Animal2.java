package javaLearn;

import java.io.IOException;

interface FutureAnimal{
  static final int b =10;
	void soundOfAnimal();
}


public class Animal2 implements FutureAnimal {

	public static void main(String[] args) {
		
		System.out.println(b);
		
		Integer a = null;
		Integer b = new Integer(10);
		System.out.println(a.intValue()==b.intValue());

	}
	


	@Override
	public void soundOfAnimal() throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

}
