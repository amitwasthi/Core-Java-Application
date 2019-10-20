package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation6 {
	
	public static void main(String[] args) {
		Map mapdef =new HashMap<>();
		
		mapdef.put(1, "");
		mapdef.put(2, "sdfsdf");
		mapdef.put(3, "dfsdf");
		mapdef.put(4, "dfsdf");
		mapdef.put(5, "");
		mapdef.put(6, "");
		
		Set set = mapdef.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
