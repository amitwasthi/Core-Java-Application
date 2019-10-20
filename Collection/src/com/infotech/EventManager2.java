package com.infotech;

import java.util.ArrayList;
import java.util.Iterator;

public class EventManager2 {
	public static void main(String[] args) {
		
		ArrayList<String> arlist = new ArrayList<>();
		
		arlist.add("Amit");
		arlist.add("Vikas");
		arlist.add("reeta");
		arlist.add("Bauaa");
		arlist.add("Ladala");
		arlist.add("1");
		arlist.add("");
		arlist.add("");
		arlist.add("");
		arlist.add("");
		arlist.add("");
		
		System.out.println(arlist+"   " +arlist.size());
		
		
		Iterator it =arlist.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
