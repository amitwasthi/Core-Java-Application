package com.infotech;

import java.util.Iterator;
import java.util.LinkedList;

public class EventManager5 {
	public static void main(String[] args) {
		
		LinkedList<String> str =new LinkedList<>();
		
		str.add("First Linked List");
		str.add("Second List");
		str.add("Third List");
		str.add("Fourth List");
		str.add("Test Application");
		str.add("evaluation");
		
		System.out.println(str);
		
		Iterator itr = str.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		/*System.out.println("------Delete Opertation ---------");
		str.remove();
		System.out.println("After remove infor  " +str);
		System.out.println("------specific position ---------");
		str.remove(4);
		System.out.println(str);
		System.out.println(str.element());
		System.out.println(str.peek());
		System.out.println(str.poll());
		System.out.println("------Specific Element Deletion ---------");*/
		
		str.remove(2);
		System.out.println(str);
		
	}

}
