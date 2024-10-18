package javaLearn;

import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {
	void soundOfAnimal() {
		System.out.println("Sound Like Animal");
	}
}

public class Dog extends Animal {

	void soundOfAnimal() {
		System.out.println("Bhoo BHoo");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.soundOfAnimal();
	}

}
