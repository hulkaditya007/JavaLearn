package javaLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeTest {

	public static void main(String[] args) {
		String ad= "Aditya";
		System.out.println(ad.chars().mapToObj(c->(char)c).map(c->Character.toLowerCase(c)).collect(Collectors.groupingBy(c->c,Collectors.counting())));
        ad.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        
        
        List<String> st = Arrays.asList("Aditya","Drishti","Anay","Nikhil","Anay","Drishti");
        
        System.out.println(st.stream().map(String::toLowerCase).flatMap(c->c.chars().mapToObj(s->(char)s)).collect(Collectors.groupingBy(c->c,Collectors.counting())));
        
        System.out.println(st.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())));
        
String input = "Hello, World!";
        
        // Convert the string to a list of characters
        List<Character> characters = input.chars()               // Create an IntStream of characters
                                           .mapToObj(c -> (char) c) // Convert to Character
                                           .collect(Collectors.toList());              // Collect into a List<Character>

        // Reverse the list of characters
        Collections.reverse(characters);
        System.out.println(characters.stream().map(String::valueOf).collect(Collectors.joining()));
        
        String inputString = "This is a sample string. This string is for testing. This is a test.";
	}

}
