package com.infotech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OperationOnSet2 {
	public static void main(String[] args) {
		
		Set<String> arrlistset=new HashSet<>();
		
		arrlistset.add("ElementEvaluation2");
		arrlistset.add("examitantion");
		arrlistset.add("Bauaaa");
		arrlistset.add("helloIndia");
		arrlistset.add("mera baua");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("");
		arrlistset.add("Bauaaa");
		arrlistset.add("Bauaaa");
		arrlistset.add("Bauaaa");
		arrlistset.add("Bauaaa");
		
		System.out.println(arrlistset +"       " +arrlistset.size()+"        "+ arrlistset.isEmpty());
		
		
		Iterator<String> itr =arrlistset.iterator();
		
		while(itr.hasNext()){
			System.out.println("  "+itr.next());
		}
		
		
		
		/*List<String> strlist =new ArrayList<String>();
		
		strlist.add("df");
		strlist.add("sdfs");
		strlist.add("");
		strlist.add("");
		strlist.add("");
		strlist.add("");
		strlist.add("");
		strlist.add("");
		strlist.add("");
		strlist.add("finalvalue");
		
		System.out.println(strlist +"       " +strlist.size()+"        "+ strlist.isEmpty());*/
		
		
		
	}

}
