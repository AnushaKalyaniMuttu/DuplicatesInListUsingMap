package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesInListUsingMap {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3);	

		list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
	}
}
