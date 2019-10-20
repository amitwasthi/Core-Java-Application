package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation3 {
	
	public static void main(String[] args) {
		
		Map mapValue =new HashMap<>();
		
		mapValue.put(1, "Bauaaaa");
		mapValue.put(2, "Bauaaaa");
		mapValue.put(3, "Bauaaaa");
		mapValue.put(4, "Bauaaaa");
		mapValue.put(5, "Bauaaaa");
		mapValue.put(6, "Bauaaaa");
		
		Set set =mapValue.entrySet();
		
		Iterator iter =set.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
