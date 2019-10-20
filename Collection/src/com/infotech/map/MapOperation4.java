package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation4 {
	
	public static void main(String[] args) {
		
		Map mapvalue =new HashMap<>();
		
		mapvalue.put(1, "BAUAA");
		mapvalue.put(1, "Reeta");
		mapvalue.put(1, "EXPLANIN");
		mapvalue.put(1, "Amit");
		mapvalue.put(1, "Amit");
		
		Set set=mapvalue.entrySet();
		
		Iterator itr =set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
