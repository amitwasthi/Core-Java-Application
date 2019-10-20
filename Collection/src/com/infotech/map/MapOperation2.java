package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation2 {
	
	public static void main(String[] args) {
		
		Map mapValue =new HashMap<>();
		
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		mapValue.put(1, "Bauaaa");
		
		Set set = mapValue.entrySet();
		
		Iterator iter =set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
	}

}
