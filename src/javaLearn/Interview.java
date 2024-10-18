package javaLearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		System.out.println(li.stream().reduce(0,Integer::sum).intValue());
		
		li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		String st23 = "Aditya";
		
		System.out.println(st23.chars().mapToObj(c->(char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(c->c,Collectors.counting())));
		
		System.out.println(st23.chars().mapToObj(c->(char)c).map(Character::toLowerCase).distinct().collect(Collectors.counting()));
		
		
		Map<Object, Long> groupedNumbers = li.stream()
	            .collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(key->key.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(groupedNumbers);
		
		String name = "drishti";
		
		String val = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(key->key.getValue()==1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).keySet().stream().map(String::valueOf).collect(Collectors.joining());   //toString(Map.Entry::getValue));
		System.out.println(val);
		
		///Min and Max in List
		
		List<Integer> minMax = li.stream().sorted().toList();
		System.out.println("Min Value " + minMax.get(0));
		System.out.println("Max Value "+ minMax.get(minMax.size()-1));
		
		
		IntSummaryStatistics st = li.stream().collect(Collectors.summarizingInt(Integer::intValue));
		
		System.out.println(st.getAverage());
		
		//Slider
		List<List<Integer>> st2 = IntStream.range(0, li.size()-1).mapToObj(n->li.subList(n, n+2)).collect(Collectors.toList());
		System.out.println(st2);
	}

}
