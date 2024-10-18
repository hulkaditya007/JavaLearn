package javaLearn;

public class FIB {
	public static void main(String[] args) {
		
		System.out.println(fibonacci(5));
		System.out.println(fact(5));
		
		
	}
	
	public static int fibonacci(int n) { 
		if (n <= 1) return n; 
		return fibonacci(n - 1) + fibonacci(n - 2); 
		} 
	
	
	public static int fact(int n) {
		if(n<=1) return n;
		return n*fact(n-1);
	}
}
