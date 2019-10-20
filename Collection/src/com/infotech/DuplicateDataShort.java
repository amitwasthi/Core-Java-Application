package com.infotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateDataShort {
	
	public static void main(String[] args) {
		List<String> str =new ArrayList<String>();
		Set<Object> set =new HashSet<>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("A");
		str.add("C");
		str = str.stream().distinct().collect(Collectors.toList());
		System.out.println(str);
		
		
	}

}
