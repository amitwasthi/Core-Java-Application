package com.infotech;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {
	public static void main(String[] args) {
		
		HashSet<String> hs =new HashSet<>();
		
		hs.add("Bauaaa");
		hs.add("Amit");
		hs.add("Reeta");
		hs.add("kumari");
		hs.add("");
		hs.add("");
		hs.add("");
		hs.add("LastElement");
		hs.add("Amit");
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove("LastElement"));
		System.out.println("Final Hash Set  "+hs);
		
		Iterator<String> itr =hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	//POINT TO BE REMENMBER
	//1. ORDER IS NOT PRESERVE.
	//2. ONLY ONE NULL VALUE WILL BE ACCEPTED.
	//3. ITS NOT SYNCHRONIZE.
	//4. MULTIPLE NULL VALUE NOT ACCEPTED.
	//5. REMOVI ELEMENT BY NAME AS WELL.

}
