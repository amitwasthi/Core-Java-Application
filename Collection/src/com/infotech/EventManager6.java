package com.infotech;

import java.util.Iterator;
import java.util.Vector;

public class EventManager6 {
	
	public static void main(String[] args) {
		
		Vector<String> vv = new Vector<>();
		vv.add("ELEMENT2");
		vv.add("ELEMENT1");
		vv.add("ELEMENT34");
		vv.add("TESSTING");
		vv.add("HelloWorld");
		
		System.out.println(vv);
		
		Iterator<String> itr =vv.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(vv.remove(2));
		System.out.println("After removed  "+vv);
		System.out.println("length  "+vv.size());
		System.out.println(vv.toString());
	}

}
