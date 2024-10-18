package javaLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview23 {

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

		System.out.println("Java 8 program to filter even numbers from a list");
		li.stream().filter(ev -> ev % 2 == 0).forEach(System.out::println);

		System.out.println("Write a Java 8 program to calculate the sum of integers in a list");
		String sum = li.stream().reduce(0, Integer::sum).toString();
		System.out.println(sum);

		System.out.println("Write a Java 8 program to find the maximum element from a list");
		Integer max = li.stream().reduce(Integer::max).get();
		Integer max2 = li.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		System.out.println(max2);

		System.out.println("Write a Java 8 program to check if a list contains a specific element");
		int element = 4;
		System.out.println(li.stream().filter(i -> i == element).findAny().isPresent());

		System.out.println("Write a Java 8 program to find the sum of all even numbers in a list of integers");
		System.out.println(li.stream().filter(i -> i % 2 == 0).reduce(Integer::sum).get());

		System.out.println("Write a Java 8 program to concatenate all strings in a list");
		System.out.println(st.stream().reduce(String::concat).get());
		System.out.println(st.stream().collect(Collectors.joining()));

		System.out.println("Write a Java 8 program to find the average length of strings in a list of strings");
		// double avg =
		// st.stream().collect(Collectors.groupingBy(c->c.length())).entrySet().stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
		System.out.println(st.stream().mapToInt(String::length).average().getAsDouble());

		System.out
				.println("Write a Java 8 program to count the occurrences of a given character in a list of strings?");
		System.out.println(st.stream().map(ch -> ch.toLowerCase()).flatMapToInt(CharSequence::chars)
				.filter(ch -> ch == 'a').count());

		
		  System.out.println(st.stream().map(ch->ch.chars().mapToObj(c->(char)c).
		  collect(Collectors.toList())).collect(Collectors.toList()).stream().flatMap(
		  List::stream).collect(Collectors.toList()));
		  
		  
		 System.out.println(st.stream().flatMap(ch->ch.chars().mapToObj(c->(char)c)).
		  collect(Collectors.toList()));
		 
		 
		List<Character> ster = st.stream().flatMap(ch -> ch.chars().mapToObj(c -> (char) c).filter(Character::isJavaLetter)).collect(Collectors.toList());
		System.out.println(ster);
		
		System.out.println(" Write a Java 8 program to check if all elements in a list are greater than a given value");
		List<Integer> bigNumbers = new ArrayList<>();
		bigNumbers.add(23);
		bigNumbers.add(36);
		bigNumbers.add(45);
		bigNumbers.add(50);
		bigNumbers.add(36);
		bigNumbers.add(20);
		bigNumbers.add(34);
		
		Optional val = Optional.ofNullable(bigNumbers);
		
		System.out.println(val.filter(y->y<30).collect(Collectors.toList()));
		System.out.println(val.isEmpty());
		
		System.out.println("----------"+bigNumbers.stream().reduce(1,(a,b)->a+b).intValue());
		System.out.println(bigNumbers);
		System.out.println(bigNumbers.stream().allMatch(num->num>10));
		
		System.out.println("Write a Java 8 program to find the factorial of a given number --- Fac = 5");
		int fac = 5;
		System.out.println(IntStream.rangeClosed(1, fac).reduce(1, (a,b)->a*b));
		
		System.out.println("Write a Java 8 program to remove duplicate elements from a list ?");
		System.out.println(bigNumbers.stream().distinct().toList());
		
		String check = "Aditya";
		System.out.println(check.chars().map(Character::toLowerCase).mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining()));

		
		System.out.println("rite a Java 8 program to find the longest string in a list of strings");
		System.out.println(st.stream().collect(Collectors.groupingBy(c->c.length())).keySet().stream().reduce((a,b)->Integer.max(a, b)).get());
		System.out.println(st.stream().max((a,b)->a.length()-b.length()).get());
		System.out.println(st.stream().reduce((a,b)->a.length()>b.length() ? a : b).get());
		
		System.out.println("All String to UpperCase");
		System.out.println(st.stream().map(ch->ch.toUpperCase()).toList());
		
		System.out.println("Multiplication of first 10 natural Numbers");
		System.out.println(IntStream.range(1, 10).reduce((a,b)->a*b).getAsInt());
		
		System.out.println("Sum of first 10 natural Numbers");
		System.out.println(IntStream.range(1, 10).reduce((a,b)->a+b).getAsInt());
		
		System.out.println("Write a Java 8 program to find the first word in a list that starts with given letter");
		System.out.println(st.stream().map(c->c.toLowerCase()).filter(ch->ch.charAt(0)=='a').findFirst().get());
		
		
		System.out.println("rite a Java 8 program print first non repetitive character in the string");
		String nonRep = "helloworld";
		System.out.println(nonRep.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(n->n.getValue()==1).findFirst());
		
		
		List<String> st2 = new ArrayList<>();
		st2.add("apple");
		st2.add("banana");
		st2.add("mangoes");
		st2.add("papaya");
		st2.add("orange");
		
		System.out.println("Write a Java 8 program print all the strings of given length");
		System.out.println(st2.stream().filter(s->s.length()==6).toList());
		
		System.out.println("Write a Java 8 program to check if a list contains a specific string");
		System.out.println(st2.stream().anyMatch(s->s.equalsIgnoreCase("orange")));
		
		System.out.println("Write Java 8 program to find first repeated character in the given string");
		System.out.println(nonRep.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).findFirst().get());
		
		System.out.println("Write Java 8 program to print duplicate elements from an array?");
		Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 1,2};
		System.out.println(Arrays.asList(array).stream().collect(Collectors.groupingBy(in->in,Collectors.counting())).entrySet().stream().filter(en->en.getValue()>1).map(en->en.getKey()).toList());
		
		System.out.println("write Java 8 program to print the most repeated element in an array?");
		System.out.println(Arrays.asList(array).stream().collect(Collectors.groupingBy(in->in,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get());
		
		int irt = 123456789;
		
		System.out.println(new Integer(irt).toString().chars().mapToObj(c->(char)c).map(c->""+c).map(Integer::parseInt).collect(Collectors.summarizingInt(Integer::intValue)).getSum());
		
		String stAg = "aditya";
		String stAg2 = "ayitad";
		
		
		stAg = Arrays.stream(stAg.split("")).sorted().reduce("",(s1,s2)->s1+s2);
		stAg2 = Arrays.stream(stAg2.split("")).sorted().reduce("",(s1,s2)->s1+s2);
		if(stAg.equalsIgnoreCase(stAg2)) {
			System.out.println("Anagram string");
		}
		else {
			System.out.println("Not Anagram string");
		}
		
		
		System.out.println("Java program to get first three maximum numbers and three minimum numbers from the given list of integers");
		System.out.println(bigNumbers.stream().sorted(Comparator.naturalOrder()).limit(3).toList());
		System.out.println(bigNumbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList());
		
		System.out.println(bigNumbers.stream().collect(Collectors.groupingBy(c->c%2==0)));
		
		List<Integer> numbers = Arrays.asList(223, 234, 145, 367, 289, 2001, 2289);
		
		System.out.println(numbers.stream().map(num->""+num).filter(num->num.charAt(0)=='2').map(Integer::parseInt).toList());
		System.out.println(numbers.stream().reduce(0,(a,b)->a+b).toString());
		
		/*
		 * st2.stream().flatMap(String::stream).collect(Collectors.groupingBy())
		 * //.stream().collect(c->c.toLowerCase(),Collectors.counting()));
		 */	
		List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers2.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b).intValue());
		
		String s1= "Aditya";
		String s2 ="Drishti";
		
		System.out.println(s1.concat(s2).chars().mapToObj(c->(char)c).map(Character::toLowerCase).distinct().collect(Collectors.toList()));
		
		int arm = 153;
		int sum2=0;
		int l = String.valueOf(arm).length();
//		while(arm/10>0) {
//			int val = arm%10;
//			arm /=10;
//			sum2  += Math.pow(val, l);
//		}
//		sum2 +=Math.pow(arm, l);
//		System.out.println(sum2);
		
		 int ok = String.valueOf(arm).chars().map(c->(char)c).map(c->Character.getNumericValue(c)).map(i->(int)Math.pow(i, l)).sum();
		 System.out.println(ok);
		}
	  
	
	   
	
}
