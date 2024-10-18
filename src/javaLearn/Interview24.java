package javaLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Interview24 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		List<String> st = new ArrayList<>();
		st.add("Hello12 ");
		st.add("Aditya98 ");
		st.add(",46");
		st.add("How are you");
		st.add("?");
		
		List<String> st2 = new ArrayList<>();
		st2.add("Hello12Java ");
		st2.add("Aditya98 ");
		st2.add(",4Java6");
		st2.add("How Java are you Java");
		st2.add("?");
		
		System.out.println(st.stream().collect(Collectors.joining()));
		
		System.out.println(st.stream().map(p->p.chars().mapToObj(ch->(char)ch).filter(d->d>='a' && d<='z').toList()).flatMap(List::stream).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(li.stream().collect(Collectors.partitioningBy(i->i%2==0)));
		
		System.out.println(st2.stream().flatMap(s -> Pattern.compile("Java").matcher(s).results()).count());
		
		
		

		
		
		
		

	}

}
