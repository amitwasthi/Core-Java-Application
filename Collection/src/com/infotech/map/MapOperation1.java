package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation1 {
	
	public static void main(String[] args) {
		
		Map map =new HashMap<>();
		
		map.put(1,"amit");
		map.put(2, "Bauaa");
		map.put(3,"ramaka");
		map.put(4,"example");
		
		Set setValue =map.entrySet();
		
		Iterator itr =setValue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
