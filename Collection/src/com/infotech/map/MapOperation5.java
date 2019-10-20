package com.infotech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation5 {
	
	public static void main(String[] args) {
		
		Map mapelement =new HashMap<>();
		
		mapelement.put(1, "");
		mapelement.put(1, "");
		mapelement.put(1, "");
		mapelement.put(1, "");
		
		Set set=mapelement.entrySet();
		
		Iterator it =set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
