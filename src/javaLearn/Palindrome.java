package javaLearn;

public class Palindrome {
	public static void main(String[] args) {
		String str = "abcbaabcba";
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < str.length()/2 && j >= str.length()/2; i++, j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
