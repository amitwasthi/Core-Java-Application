package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Management1 {
	public static void main(String[] args) {
		
		int[] intarray ={4,5,2,1,8,6,9};
		Arrays.sort(intarray);
		System.out.println("Sorted Value is "+Arrays.toString(intarray));
		
		String[] strarray ={"A","W","B","F","C"};
		Arrays.sort(strarray);
		System.out.println("String Sorted  "+Arrays.toString(strarray));
		
		List<String> list =new ArrayList<>();
		list.add("AB");
		list.add("DD");
		list.add("MM");
		list.add("FF");
		list.add("AQ");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
