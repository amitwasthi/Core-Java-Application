package com.infotech.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperation {
	public static void main(String[] args) {
		
		TreeMap treemap = new TreeMap<>();
		
		treemap.put(1,"BAUAA");
		treemap.put("EXAMPLE1", "EXAMPLE");
		treemap.put("EXAMPLE2", "EXAMPLE");
		treemap.put("EXAMPLE3", "EXAMPLE");
		treemap.put("EXAMPLE4", "EXAMPLE");
		treemap.put("EXAMPLE5", "EXAMPLE");
		treemap.put("EXAMPLE6", "EXAMPLE");
		treemap.put(3, "");
		treemap.put(4, "");
		treemap.put(5, "");
		treemap.put(6, "");
		treemap.put(7, "");
		treemap.put(8, "AMIT");
		
		
		System.out.println(treemap);
		
		Set setvalue=treemap.entrySet();
		Iterator itr = setvalue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
			
	}

}
