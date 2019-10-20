package com.infotech;

import java.util.ArrayList;
import java.util.Iterator;

public class EventManager4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arlist =new ArrayList<>();
		
		arlist.add(1);
		arlist.add(3);
		//arlist.add("fourth");
		arlist.add(5);
		arlist.add(2);
		arlist.add(9);
		
		System.out.println("Printed the object " +arlist);
		
		Iterator itr =arlist.iterator();
		
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    }
		
	}

}
