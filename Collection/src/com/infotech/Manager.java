package com.infotech;

import java.util.Enumeration;
import java.util.Vector;

public class Manager {
	
	public static void main(String[] args) {
		
		Vector v= new Vector();
		for(int i=1;i<=10;i++){
			v.addElement(i);
		}
		
		System.out.println(v);
		
		Enumeration en =v.elements();
		
		while(en.hasMoreElements()){
			int i = (Integer)en.nextElement();
			System.out.println(i + " ");
		}
		
		
	}

}
