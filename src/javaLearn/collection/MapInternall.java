package javaLearn.collection;

public class MapInternall {

	public static void main(String[] args) {
		String s = "One";
		System.out.println(s.hashCode());
		
		System.out.println(Integer.toBinaryString(s.hashCode()));
		System.out.println(Integer.toBinaryString(32-1));
		
		System.out.println(Integer.parseInt("10110",2));
	
		int index = ((s.hashCode() & (16-1)));
		System.out.print(index);
	}

}
