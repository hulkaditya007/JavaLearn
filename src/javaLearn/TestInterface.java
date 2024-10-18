package javaLearn;

public class TestInterface implements TestInte {
	public static void main(String[] args) {
		TestInte t = new TestInterface();
		System.out.println(t.A);
		t.d.soundOfAnimal();

	}
}

interface TestInte {
	final int A = 10;
	public final Dog d = new Dog();

}
